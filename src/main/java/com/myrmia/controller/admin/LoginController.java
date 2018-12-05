package com.myrmia.controller.admin;

import com.myrmia.model.OptionsDO;
import com.myrmia.service.OptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * admin login controller
 * Created by Ellery on 2018/11/1.
 */
@Controller("adminLoginController")
@RequestMapping("/admin")
public class LoginController {

    private OptionsService optionsService;

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String test(Model model) {

        // 查询网址名称
        OptionsDO optionsDO = optionsService.queryOptionsByName("siteTitle");
        model.addAttribute("siteTitle", optionsDO.getOptionsValue());

        return "admin/login";
    }

    @Autowired
    public void setOptionsService(OptionsService optionsService) {
        this.optionsService = optionsService;
    }
}
