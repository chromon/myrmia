package com.myrmia.service.impl;

import com.myrmia.dao.UsersDAO;
import com.myrmia.model.UsersDO;
import com.myrmia.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户信息业务逻辑实现类
 * Created by Ellery on 2018/10/13.
 */
@Service("userService")
public class UsersServiceImpl implements UsersService {

    private UsersDAO usersDAO;

    /**
     * 添加用户
     * @param usersDO 用户信息
     */
    public void saveUsers(UsersDO usersDO) {
        this.usersDAO.addUsers(usersDO);
    }

    @Autowired
    public void setUsersDAO(UsersDAO usersDAO) {
        this.usersDAO = usersDAO;
    }
}
