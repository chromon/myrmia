package com.myrmia.dao;

import com.myrmia.model.CommentsDO;

/**
 * comments dao
 * Created by Ellery on 2019/1/13.
 */
public interface CommentsDAO {

    /**
     * 添加评论
     * @param commentsDO 评论信息
     */
    void addComments(CommentsDO commentsDO);
}
