package com.myrmia.service;

import com.myrmia.model.CommentsDO;

import java.util.List;

/**
 * comments service
 * Created by Ellery on 2019/1/13.
 */
public interface CommentsService {

    /**
     * 添加评论
     * @param commentsDO 评论信息
     */
    void addComments(CommentsDO commentsDO);

    /**
     * 由文章 id 查询评论列表
     * @param cid 文章 id
     * @return 评论列表
     */
    List<CommentsDO> queryCommentsByCid(int cid);

    /**
     * 更新评论
     * @param commentsDO 评论信息
     */
    void modifyComments(CommentsDO commentsDO);

    /**
     * 删除评论
     * @param commentsDO 评论信息
     */
    void deleteComments(CommentsDO commentsDO);
}
