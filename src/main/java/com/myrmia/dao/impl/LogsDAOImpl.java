package com.myrmia.dao.impl;

import com.myrmia.dao.LogsDAO;
import com.myrmia.model.LogsDO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * logs dao impl
 * Created by Ellery on 2019/1/11.
 */
@Repository
public class LogsDAOImpl implements LogsDAO {

    @Resource
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    /**
     * 添加日志
     * @param logsDO 日志信息
     */
    @Override
    public void addLogs(LogsDO logsDO) {
        this.getSession().save(logsDO);
    }
}
