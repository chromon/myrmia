package com.myrmia.dao.impl;

import com.myrmia.dao.RelationshipsDAO;
import com.myrmia.model.RelationshipsDO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
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

    /**
     * 由文章 id 和数据 id 查询关系信息
     * @param cid 文章 id
     * @param mid 数据 id
     * @return 关系信息
     */
    @Override
    public RelationshipsDO queryRelationshipsByCidMid(int cid, int mid) {
        String sql = "from RelationshipsDO r where r.cid =:cid and r.mid =:mid";
        Query query = this.getSession().createQuery(sql);
        query.setParameter("cid", cid);
        query.setParameter("mid", mid);
        return (RelationshipsDO) query.uniqueResult();
    }

    /**
     * 查询关系数量
     * @param cid 文章 id
     * @param mid 数据 id
     * @return 关系数量
     */
    @Override
    public int queryRelationshipsCount(int cid, int mid) {
        String sql = "select count(*) from RelationshipsDO r where r.cid =:cid and r.mid =:mid";
        Query query = this.getSession().createQuery(sql);
        query.setParameter("cid", cid);
        query.setParameter("mid", mid);
        return ((Number)query.uniqueResult()).intValue();
    }
}
