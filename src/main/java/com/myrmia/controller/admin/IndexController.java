package com.myrmia.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * admin index controller
 * Created by Ellery on 2018/10/31.
 */
@Controller("adminIndexController")
@RequestMapping("/admin")
public class IndexController {

    @RequestMapping(value={"/", "/index"}, method = RequestMethod.GET)
    public String test(Model model) {
        return "admin/index";
    }
}
