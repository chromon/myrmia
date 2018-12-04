package com.myrmia.dao.impl;

import com.myrmia.dao.OptionsDAO;
import com.myrmia.model.OptionsDO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * 网站信息数据持久化
 * Created by Ellery on 2018/12/4.
 */
@Repository
public class OptionsDAOImpl implements OptionsDAO{

    @Resource
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    /**
     * 添加网站信息
     * @param optionsDO 网站信息
     */
    @Override
    public void addOptions(OptionsDO optionsDO) {
        this.getSession().save(optionsDO);
    }
}
