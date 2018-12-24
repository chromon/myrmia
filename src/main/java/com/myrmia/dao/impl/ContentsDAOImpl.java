package com.myrmia.dao.impl;

import com.myrmia.dao.ContentsDAO;
import com.myrmia.model.ContentsDO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

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

    /**
     * 添加文章
     * @param contentsDO 文章内容
     */
    @Override
    public void addContents(ContentsDO contentsDO) {
        this.getSession().save(contentsDO);
    }

    /**
     * 查询全部文章
     * @return 文章列表
     */
    @Override
    public List<ContentsDO> queryContents() {
        String sql = "from ContentsDO";
        Query query = this.getSession().createQuery(sql);
        return query.list();
    }

    /**
     * 更新文章
     * @param contentsDO 文章内容
     */
    @Override
    public void updateContents(ContentsDO contentsDO) {
        this.getSession().update(contentsDO);
    }

    /**
     * 删除文章
     * @param contentsDO 文章内容
     */
    @Override
    public void deleteContents(ContentsDO contentsDO) {
        this.getSession().delete(contentsDO);
    }

    /**
     * 由 id 查询文章
     * @param cid 文章 id
     * @return 详细信息
     */
    @Override
    public ContentsDO queryContentByCid(int cid) {
        String sql = "from ContentsDO c where cid =:cid";
        Query query = this.getSession().createQuery(sql);
        query.setParameter("cid", cid);
        return (ContentsDO) query.uniqueResult();
    }
}
