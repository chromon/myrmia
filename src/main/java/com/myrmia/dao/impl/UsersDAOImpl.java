package com.myrmia.dao.impl;

import com.myrmia.dao.UsersDAO;
import com.myrmia.model.UsersDO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * 用户信息持久化
 * Created by Ellery on 2018/10/13.
 */
@Repository
public class UsersDAOImpl implements UsersDAO {


    @Resource
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    /**
     * 添加用户
     * @param usersDO 用户信息
     */
    public void addUsers(UsersDO usersDO) {
        this.getSession().save(usersDO);
    }
}