package com.myrmia.dao.impl;

import com.myrmia.dao.RelationshipsDAO;
import com.myrmia.model.RelationshipsDO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * relationships dao impl
 * Created by Ellery on 2018/12/30.
 */
@Repository
public class RelationshipsDAOImpl implements RelationshipsDAO {

    @Resource
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    /**
     * 添加文章元数据对应关系
     * @param relationshipsDO 关系
     */
    @Override
    public void addRelationships(RelationshipsDO relationshipsDO) {
        this.getSession().save(relationshipsDO);
    }
}
