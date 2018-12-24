package com.myrmia.service;

import com.myrmia.model.ContentsDO;

import java.util.List;

/**
 * contents service
 * Created by Ellery on 2018/12/17.
 */
public interface ContentsService {

    /**
     * 添加文章
     * @param contentsDO 文章内容
     */
    void saveContents(ContentsDO contentsDO);

    /**
     * 查询全部文章
     * @return 文章列表
     */
    List<ContentsDO> queryContents();

    /**
     * 更新文章
     * @param contentsDO 文章内容
     */
    void updateContents(ContentsDO contentsDO);

    /**
     * 删除文章
     * @param contentsDO 文章内容
     */
    void deleteContents(ContentsDO contentsDO);

    /**
     * 由 id 查询文章
     * @param cid 文章 id
     * @return 详细信息
     */
    ContentsDO queryContentByCid(int cid);
}
