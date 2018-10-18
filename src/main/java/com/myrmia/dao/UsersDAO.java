package com.myrmia.dao;

import com.myrmia.model.UsersDO;

/**
 * 用户信息数据访问对象
 * Created by Ellery on 2018/10/13.
 */
public interface UsersDAO {

    /**
     * 添加用户
     * @param usersDO 用户信息
     */
    void addUsers(UsersDO usersDO);
}