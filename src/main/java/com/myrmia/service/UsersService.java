package com.myrmia.service;

import com.myrmia.model.UsersDO;

/**
 * 用户信息处理业务逻辑接口
 * Created by Ellery on 2018/10/13.
 */
public interface UsersService {

    /**
     * 添加用户
     * @param usersDO 用户信息
     */
    void saveUsers(UsersDO usersDO);

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
    void modifyUser(UsersDO usersDO);

    /**
     * 删除用户
     * @param usersDO 用户信息
     */
    void deleteUser(UsersDO usersDO);
}
