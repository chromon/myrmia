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
 * admin index controller
 * Created by Ellery on 2018/10/31.
 */
@Controller("adminIndexController")
@RequestMapping("/admin")
public class IndexController {

    private ContentsService contentsService;

    @RequestMapping(value={"/", "/index"}, method = RequestMethod.GET)
    public String test(Model model) {

        List<ContentsDO> contentsDOList = contentsService.queryLastContents(10);
        model.addAttribute("contentsDOList", contentsDOList);

        model.addAttribute("contentsSize", contentsDOList.size());

        model.addAttribute("active", "home");
        return "admin/index";
    }

    @Autowired
    public void setContentsService(ContentsService contentsService) {
        this.contentsService = contentsService;
    }
}
