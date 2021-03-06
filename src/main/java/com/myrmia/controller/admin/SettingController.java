package com.myrmia.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * admin article controller
 * Created by Ellery on 2018/11/1.
 */
@Controller("adminSettingController")
@RequestMapping("/admin")
public class SettingController {

    @RequestMapping(value="/setting", method = RequestMethod.GET)
    public String test(Model model) {

        model.addAttribute("active", "setting");
        return "admin/setting";
    }
}
