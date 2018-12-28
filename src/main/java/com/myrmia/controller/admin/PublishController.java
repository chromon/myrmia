package com.myrmia.controller.admin;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.myrmia.dto.ArticleDTO;
import com.myrmia.model.AttachDO;
import com.myrmia.model.ContentsDO;
import com.myrmia.model.MetasDO;
import com.myrmia.model.UsersDO;
import com.myrmia.service.AttachService;
import com.myrmia.service.ContentsService;
import com.myrmia.service.MetasService;
import com.myrmia.utils.date.DateUtils;
import com.myrmia.utils.file.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * admin article controller
 * Created by Ellery on 2018/11/1.
 */
@Controller("adminPublishController")
@RequestMapping("/admin")
public class PublishController {

    private AttachService attachService;
    private MetasService metasService;
    private ContentsService contentsService;

    @RequestMapping(value="/publish", method = RequestMethod.GET)
    public String test(Model model) {
        model.addAttribute("active", "publish");

        // 查询分类列表
        List<MetasDO> categoryList = metasService.queryMetasByType("category");
        model.addAttribute("categoryList", categoryList);
        model.addAttribute("editAction", "false");

        return "admin/publish";
    }

    /**
     * 上传图片
     * @param file multipartfile
     * @param request HTTP servlet request
     * @return image path
     */
    @RequestMapping(value = "/imgUpload", method = RequestMethod.POST)
    @ResponseBody
    public Object uploadImage(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request) {

        File destFile;
        UsersDO usersDO = (UsersDO) request.getSession(true).getAttribute("usersDO");

        if (!file.isEmpty()) {
            try {
                String path = request.getSession().getServletContext().getRealPath("/resources/upload");
                FileUtils.isDirectory(path);

                String fileName = UUID.randomUUID().toString().replace("-", "") + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
                destFile = new File(path + File.separator + fileName);

                file.transferTo(destFile);

                // 保存附件信息
                AttachDO attachDO = new AttachDO();
                attachDO.setFileName(fileName);
                attachDO.setFileKey(File.separator + "resources"+ File.separator + "upload" + File.separator + fileName);
                attachDO.setFileType("image");
                attachDO.setAuthorId(usersDO.getUid());
                attachDO.setCreated(new Date().getTime());
                attachService.saveAttach(attachDO);

                // json 格式化
                ObjectMapper mapper = new ObjectMapper();
                // System.out.println(File.separator + "upload" + File.separator + fileName);
                return mapper.writeValueAsString(File.separator + "resources"+ File.separator + "upload" + File.separator + fileName);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 删除图片
     * @param imgSrc 图片路径
     * @param request http servlet request
     * @return boolean
     */
    @RequestMapping(value = "/imgDelete", method = RequestMethod.POST)
    @ResponseBody
    public boolean deleteImage(@RequestParam("imgSrc") String imgSrc, HttpServletRequest request) {

        String path = request.getSession().getServletContext().getRealPath("/resources/upload");

        String fileName = imgSrc.substring(imgSrc.lastIndexOf("/") + 1);
        File file = new File(path + File.separator + fileName);

        if (file.exists() && file.isFile()) {

            // 删除附件信息
            AttachDO attachDO = attachService.queryAttachByFileName(fileName);
            if (attachDO != null) {
                attachService.deleteAttach(attachDO);
            }

            file.delete();
            return true;
        }

        return false;
    }

    @RequestMapping(value = "/postArticle", method = RequestMethod.POST)
    @ResponseBody
    public boolean postArticle(@ModelAttribute ArticleDTO articleDTO, HttpServletRequest request) {

        return saveArticle(articleDTO, "published", request);
    }

    @RequestMapping(value = "/postArticleDraft", method = RequestMethod.POST)
    @ResponseBody
    public boolean postArticleDraft(@ModelAttribute ArticleDTO articleDTO, HttpServletRequest request) {

        return saveArticle(articleDTO, "drafted", request);
    }

    private boolean saveArticle(ArticleDTO articleDTO, String status,
                                HttpServletRequest request) {
        UsersDO usersDO = (UsersDO) request.getSession(true).getAttribute("usersDO");

        // 保存内容
        ContentsDO contentsDO;

        if (articleDTO.isEdit()) {
            // 处于编辑模式
            contentsDO = contentsService.queryContentByCid(articleDTO.getCid());
        } else {
            // 正常模式
            contentsDO = new ContentsDO();
        }

        contentsDO.setTitle(articleDTO.getArticleTitle());
        contentsDO.setSlug(articleDTO.getArticleSlug());
        if (articleDTO.isEdit()) {
            contentsDO.setModified(new Date().getTime());
        } else {
            contentsDO.setCreated(new Date().getTime());
        }
        contentsDO.setContent(articleDTO.getArticleContent());
        contentsDO.setAuthorId(usersDO.getUid());
        contentsDO.setFmtType("html");
        contentsDO.setContentType("post");
        contentsDO.setStatus(status);
        contentsDO.setTags(articleDTO.getArticleTags());
        contentsDO.setCategories(articleDTO.getArticleCategory());
        contentsDO.setAllowComment(articleDTO.isAllowComment()? 1: 0);
        contentsDO.setAllowFeed(articleDTO.isAllowFeed()? 1: 0);

        if (articleDTO.isEdit()) {
            // 编辑模式更新
            contentsService.modifyContents(contentsDO);
        } else {
            // 正常模式创建
            contentsService.saveContents(contentsDO);
        }

        // 自定义文章访问路径，默认为文章 id
        if (contentsDO.getSlug() == null) {
            contentsDO.setSlug(contentsDO.getCid() + "");
            contentsService.modifyContents(contentsDO);
        }

        return true;
    }

    @RequestMapping(value = "/deleteArticle", method = RequestMethod.POST)
    @ResponseBody
    public boolean deleteArticle(@RequestParam("cid") int cid) {

        ContentsDO contentsDO = this.contentsService.queryContentByCid(cid);
        if (contentsDO != null) {
            this.contentsService.deleteContents(contentsDO);
        }

        return true;
    }

    @RequestMapping(value = "/editArticle/{cid}", method = RequestMethod.GET)
    public String editArticle(@PathVariable("cid") int cid, Model model) {

        ContentsDO contentsDO = this.contentsService.queryContentByCid(cid);
        if (contentsDO != null) {
            model.addAttribute("editAction", "true");
           model.addAttribute("contentsDO", contentsDO);
        }

        model.addAttribute("active", "publish");

        // 查询分类列表
        List<MetasDO> categoryList = metasService.queryMetasByType("category");
        model.addAttribute("categoryList", categoryList);

        return "admin/publish";
    }

    @Autowired
    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }

    @Autowired
    public void setMetasService(MetasService metasService) {
        this.metasService = metasService;
    }

    @Autowired
    public void setContentsService(ContentsService contentsService) {
        this.contentsService = contentsService;
    }
}
