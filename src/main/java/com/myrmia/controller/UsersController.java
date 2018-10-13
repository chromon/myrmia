package com.myrmia.controller;

import com.myrmia.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * users controller
 * Created by Ellery on 2018/10/13.
 */
@Controller
public class UsersController {

    private UsersService usersService;



    @Autowired
    public void setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }
}
