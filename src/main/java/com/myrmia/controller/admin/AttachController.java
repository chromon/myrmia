package com.myrmia.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * admin attach controller
 * Created by Ellery on 2018/11/1.
 */
@Controller("adminAttachController")
@RequestMapping("/admin")
public class AttachController {

    @RequestMapping(value="/attach", method = RequestMethod.GET)
    public String test(Model model) {
        return "admin/attach";
    }
}
