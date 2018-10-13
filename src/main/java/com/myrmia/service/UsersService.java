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
}
