package com.myrmia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * users controller
 * Created by Ellery on 2018/10/13.
 */
@Controller
public class ArchivesController implements BaseController {

    @RequestMapping(value="/archives", method = RequestMethod.GET)
    public String test(Model model) {
        return "theme/" + THEME + "/archives";
    }

}
