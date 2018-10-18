package com.myrmia.controller;

import com.myrmia.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * users controller
 * Created by Ellery on 2018/10/13.
 */
@Controller
public class indexController {

    @RequestMapping(value={"/", "/index"}, method = RequestMethod.GET)
    public String test(Model model) {
        return "index";
    }

}
