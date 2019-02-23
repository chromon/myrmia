package com.myrmia.controller.admin;

import com.myrmia.model.MetasDO;
import com.myrmia.service.MetasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * admin article controller
 * Created by Ellery on 2018/11/1.
 */
@Controller("adminLinksController")
@RequestMapping("/admin")
public class LinksController {

    private MetasService metasService;

    @RequestMapping(value="/links", method = RequestMethod.GET)
    public String test(Model model) {
        List<MetasDO> metasDOList = metasService.queryMetasByType("link");

        model.addAttribute("active", "links");
        model.addAttribute("linkList", metasDOList);

        return "admin/links";
    }

    /**
     * 保存友链
     * @param linkName 链接名称
     * @param originLink 链接地址
     * @param linkSort 链接排序
     * @param model model
     * @return 链接信息
     */
    @RequestMapping(value="/addLink", method = RequestMethod.POST)
    @ResponseBody
    public MetasDO addCategory(@RequestParam("linkName") String linkName,
                               @RequestParam("originLink") String originLink,
                               @RequestParam("linkSort") int linkSort, Model model) {
        MetasDO metasDO = new MetasDO();
        metasDO.setName(linkName);
        metasDO.setSlug(originLink);
        metasDO.setMetasType("link");
        metasDO.setSort(linkSort);
        metasService.saveMetas(metasDO);

        return metasDO;
    }

    @RequestMapping(value="/deleteLink", method = RequestMethod.POST)
    @ResponseBody
    public MetasDO addCategory(@RequestParam("mid") int mid, Model model) {
        MetasDO metasDO = metasService.queryMetasByMid(mid);
        if(metasDO != null) {
            metasService.deleteMetas(metasDO);
        }

        return metasDO;
    }

    @Autowired
    public void setMetasService(MetasService metasService) {
        this.metasService = metasService;
    }
}
