package com.myrmia.controller.admin;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.myrmia.utils.file.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

/**
 * admin article controller
 * Created by Ellery on 2018/11/1.
 */
@Controller("adminPublishController")
@RequestMapping("/admin")
public class PublishController {

    @RequestMapping(value="/publish", method = RequestMethod.GET)
    public String test(Model model) {
        model.addAttribute("active", "publish");
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

        if (!file.isEmpty()) {
            try {
                String path = request.getSession().getServletContext().getRealPath("/resources/upload");
                FileUtils.isDirectory(path);

                String fileName = UUID.randomUUID().toString().replace("-", "") + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
                destFile = new File(path + File.separator + fileName);

                file.transferTo(destFile);

                // json 格式化
                ObjectMapper mapper = new ObjectMapper();
                System.out.println(File.separator + "upload" + File.separator + fileName);
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
     * @return
     */
    @RequestMapping(value = "/imgDelete", method = RequestMethod.POST)
    @ResponseBody
    public boolean deleteImage(@RequestParam("imgSrc") String imgSrc, HttpServletRequest request) {

        String path = request.getSession().getServletContext().getRealPath("/resources/upload");

        String fileName = imgSrc.substring(imgSrc.lastIndexOf("/") + 1);
        File file = new File(path + File.separator + fileName);

        if (file.exists() && file.isFile()) {
            file.delete();
            return true;
        }

        return false;
    }
}
