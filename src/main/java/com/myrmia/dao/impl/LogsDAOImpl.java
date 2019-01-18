package com.myrmia.dao.impl;

import com.myrmia.dao.LogsDAO;
import com.myrmia.model.LogsDO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

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

    /**
     * 查询日志列表
     * @return 日志列表
     */
    @Override
    public List<LogsDO> queryLogs() {
        String sql = "from LogsDO";
        Query query = this.getSession().createQuery(sql);
        return query.list();
    }

    /**
     * 更新日志
     * @param logsDO 日志信息
     */
    @Override
    public void updateLogs(LogsDO logsDO) {
        this.getSession().update(logsDO);
    }

    /**
     * 删除日志
     * @param logsDO 日志信息
     */
    @Override
    public void deleteLogs(LogsDO logsDO) {
        this.getSession().delete(logsDO);
    }
}
