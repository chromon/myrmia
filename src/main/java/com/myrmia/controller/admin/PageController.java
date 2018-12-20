package com.myrmia.controller.admin;

import com.myrmia.model.ContentsDO;
import com.myrmia.service.ContentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * admin article controller
 * Created by Ellery on 2018/11/1.
 */
@Controller("adminPageController")
@RequestMapping("/admin")
public class PageController {

    private ContentsService contentsService;

    @RequestMapping(value="/page", method = RequestMethod.GET)
    public String test(Model model) {
        model.addAttribute("active", "page");

        List<ContentsDO> contentsDOList = contentsService.queryContents();
        model.addAttribute("contentsDOList", contentsDOList);

        return "admin/page";
    }

    @Autowired
    public void setContentsService(ContentsService contentsService) {
        this.contentsService = contentsService;
    }
}
