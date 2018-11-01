package com.myrmia.controller.admin;

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

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String test(Model model) {
        return "admin/login";
    }
}
