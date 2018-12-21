package com.myrmia.controller.admin;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.myrmia.model.MetasDO;
import com.myrmia.service.MetasService;
import com.myrmia.utils.info.Information;
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
@Controller("adminCategoryController")
@RequestMapping("/admin")
public class CategoryController {

    private MetasService metasService;

    @RequestMapping(value="/category", method = RequestMethod.GET)
    public String category(Model model) {
        model.addAttribute("active", "category");

        // 查询分类列表
        List<MetasDO> categoryList = metasService.queryMetasByType("category");
        model.addAttribute("categoryList", categoryList);

        return "admin/category";
    }

    @RequestMapping(value="/addCategory", method = RequestMethod.POST)
    @ResponseBody
    public MetasDO addCategory(@RequestParam("metasName") String metasName, Model model) {

        // 保存分类
        MetasDO metasDO = new MetasDO();
        metasDO.setName(metasName);
        metasDO.setMetasType("category");
        metasService.saveMetas(metasDO);

        return metasDO;
    }

    @RequestMapping(value="/deleteCategory", method = RequestMethod.POST)
    @ResponseBody
    public String deleteCategory(@RequestParam("mid") int mid, Model model) throws JsonProcessingException {

        // 删除分类
        MetasDO metasDO = metasService.queryMetasById(mid);
        if (metasDO != null) {
            metasService.deleteMetas(metasDO);
        }

        // 返回消息
        Information info = new Information();
        info.setInfoType("success");
        info.setInfoContent("delete category success.");

        // json 格式化
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(info);
    }

    @Autowired
    public void setMetasService(MetasService metasService) {
        this.metasService = metasService;
    }
}