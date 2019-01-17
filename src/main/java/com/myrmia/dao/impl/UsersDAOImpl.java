package com.myrmia.dao.impl;

import com.myrmia.dao.UsersDAO;
import com.myrmia.model.UsersDO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

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

    /**
     * 由用户名查询用户信息
     * @param username 用户名
     * @return 用户信息
     */
    @Override
    public UsersDO queryUsersByName(String username) {
        String sql = "from UsersDO u where u.username =:username";
        Query query = this.getSession().createQuery(sql);
        query.setParameter("username", username);
        return (UsersDO) query.uniqueResult();
    }

    /**
     * 查询用户列表
     * @return 用户列表
     */
    @Override
    public List<UsersDO> queryUsers() {
        String sql = "from UsersDO";
        Query query = this.getSession().createQuery(sql);
        return query.list();
    }

    /**
     * 更新用户
     * @param usersDO 用户信息
     */
    @Override
    public void updateUser(UsersDO usersDO) {
        this.getSession().update(usersDO);
    }

    /**
     * 删除用户
     * @param usersDO 用户信息
     */
    @Override
    public void deleteUser(UsersDO usersDO) {
        this.getSession().delete(usersDO);
    }
}
