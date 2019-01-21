package com.myrmia.service.impl;

import com.myrmia.dao.CommentsDAO;
import com.myrmia.model.CommentsDO;
import com.myrmia.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * comments service impl
 * Created by Ellery on 2019/1/13.
 */
@Service("commentsService")
public class CommentsServiceImpl implements CommentsService {

    private CommentsDAO commentsDAO;

    /**
     * 添加评论
     * @param commentsDO 评论信息
     */
    @Override
    public void addComments(CommentsDO commentsDO) {
        this.commentsDAO.addComments(commentsDO);
    }

    /**
     * 由文章 id 查询评论列表
     * @param cid 文章 id
     * @return 评论列表
     */
    @Override
    public List<CommentsDO> queryCommentsByCid(int cid) {
        return this.commentsDAO.queryCommentsByCid(cid);
    }

    /**
     * 查询最新评论
     * @param count 查询数量
     * @return 评论列表
     */
    @Override
    public List<CommentsDO> queryLastComments(int count) {
        return this.commentsDAO.queryLastComments(count);
    }

    /**
     * 更新评论
     * @param commentsDO 评论信息
     */
    @Override
    public void modifyComments(CommentsDO commentsDO) {
        this.commentsDAO.updateComments(commentsDO);
    }

    /**
     * 删除评论
     * @param commentsDO 评论信息
     */
    @Override
    public void deleteComments(CommentsDO commentsDO) {
        this.commentsDAO.deleteComments(commentsDO);
    }

    @Autowired
    public void setCommentsDAO(CommentsDAO commentsDAO) {
        this.commentsDAO = commentsDAO;
    }
}
