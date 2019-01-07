package com.myrmia.dao.impl;

import com.myrmia.dao.OptionsDAO;
import com.myrmia.model.OptionsDO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * 网站信息数据持久化
 * Created by Ellery on 2018/12/4.
 */
@Repository
public class OptionsDAOImpl implements OptionsDAO {

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

    /**
     * 由选项名称查询详细信息
     * @param optionsName 选项名称
     * @return 详细信息
     */
    @Override
    public OptionsDO queryOptionsByName(String optionsName) {
        String sql = "from OptionsDO o where o.optionsName =:optionsName";
        Query query = this.getSession().createQuery(sql);
        query.setParameter("optionsName", optionsName);
        return (OptionsDO) query.uniqueResult();
    }

    /**
     * 更新信息
     * @param optionsDO 信息
     */
    @Override
    public void updateOptions(OptionsDO optionsDO) {
        this.getSession().update(optionsDO);
    }

    /**
     * 删除信息
     * @param optionsDO 信息
     */
    @Override
    public void deleteOptions(OptionsDO optionsDO) {
        this.getSession().delete(optionsDO);
    }
}
