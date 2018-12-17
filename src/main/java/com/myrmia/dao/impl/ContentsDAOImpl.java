package com.myrmia.dao.impl;

import com.myrmia.dao.ContentsDAO;
import com.myrmia.model.ContentsDO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * contents dao impl
 * Created by Ellery on 2018/12/17.
 */
@Repository
public class ContentsDAOImpl implements ContentsDAO {

    @Resource
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addContents(ContentsDO contentsDO) {
        this.getSession().save(contentsDO);
    }
}
