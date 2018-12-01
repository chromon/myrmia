package com.myrmia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * index controller
 * Created by Ellery on 2018/10/13.
 */
@Controller
public class IndexController implements BaseController {

    @RequestMapping(value={"/", "/index"}, method = RequestMethod.GET)
    public String test(Model model) {
        return "theme/" + THEME + "/index";
    }

}
