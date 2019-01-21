package com.myrmia.dao.impl;

import com.myrmia.dao.CommentsDAO;
import com.myrmia.model.CommentsDO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

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

    /**
     * 由文章 id 查询评论列表
     * @param cid 文章 id
     * @return 评论列表
     */
    @Override
    public List<CommentsDO> queryCommentsByCid(int cid) {
        String sql = "from CommentsDO c where c.cid=:cid";
        Query query = this.getSession().createQuery(sql);
        query.setParameter("cid", cid);
        return query.list();
    }

    /**
     * 查询最新评论
     * @param count 查询数量
     * @return 评论列表
     */
    @Override
    public List<CommentsDO> queryLastComments(int count) {
        String sql = "from CommentsDO";
        Query query = this.getSession().createQuery(sql);
        query.setFirstResult(0);
        query.setMaxResults(count);
        return query.list();
    }

    /**
     * 更新评论
     * @param commentsDO 评论信息
     */
    @Override
    public void updateComments(CommentsDO commentsDO) {
        this.getSession().update(commentsDO);
    }

    /**
     * 删除评论
     * @param commentsDO 评论信息
     */
    @Override
    public void deleteComments(CommentsDO commentsDO) {
        this.getSession().delete(commentsDO);
    }
}
