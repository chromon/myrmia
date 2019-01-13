package com.myrmia.service;

import com.myrmia.model.CommentsDO;

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
}
