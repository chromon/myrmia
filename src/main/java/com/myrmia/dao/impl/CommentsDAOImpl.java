package com.myrmia.dao.impl;

import com.myrmia.dao.CommentsDAO;
import com.myrmia.model.CommentsDO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * comments dao impl
 * Created by Ellery on 2019/1/13.
 */
@Repository
public class CommentsDAOImpl implements CommentsDAO {

    @Resource
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    /**
     * 添加评论
     * @param commentsDO 评论信息
     */
    @Override
    public void addComments(CommentsDO commentsDO) {
        this.getSession().save(commentsDO);
    }
}
