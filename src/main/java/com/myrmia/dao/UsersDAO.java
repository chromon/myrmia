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

    /**
     * 由用户名查询用户信息
     * @param username 用户名
     * @return 用户信息
     */
    UsersDO queryUsersByName(String username);

    /**
     * 更新用户
     * @param usersDO 用户信息
     */
    void updateUser(UsersDO usersDO);

    /**
     * 删除用户
     * @param usersDO 用户信息
     */
    void deleteUser(UsersDO usersDO);
}
