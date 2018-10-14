package com.myrmia.controller;

import com.myrmia.model.UsersDO;
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
public class UsersController {

    private UsersService usersService;


    @RequestMapping(value="/test", method = RequestMethod.GET)
    public String test(Model model) {
//        UsersDO usersDO = new UsersDO();
//        usersDO.setUsername("test");
//        usersDO.setPassword("test");
//        usersDO.setCreated(1);
//        usersService.saveUsers(usersDO);

        model.addAttribute("name", "ellery");

        return "test";
    }

    @Autowired
    public void setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }
}
