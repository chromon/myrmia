package com.myrmia.service.impl;

import com.myrmia.dao.ContentsDAO;
import com.myrmia.model.ContentsDO;
import com.myrmia.service.ContentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * contents service impl
 * Created by Ellery on 2018/12/17.
 */
@Service("contentsService")
public class ContentsServiceImpl implements ContentsService {

    private ContentsDAO contentsDAO;

    /**
     * 添加文章
     * @param contentsDO 文章内容
     */
    @Override
    public void saveContents(ContentsDO contentsDO) {
        this.contentsDAO.addContents(contentsDO);
    }

    /**
     * 查询全部文章
     * @return 文章列表
     */
    @Override
    public List<ContentsDO> queryContents() {
        return this.contentsDAO.queryContents();
    }

    /**
     * 更新文章
     * @param contentsDO 文章内容
     */
    @Override
    public void updateContents(ContentsDO contentsDO) {
        this.contentsDAO.updateContents(contentsDO);
    }

    /**
     * 删除文章
     * @param contentsDO 文章内容
     */
    @Override
    public void deleteContents(ContentsDO contentsDO) {
        this.contentsDAO.deleteContents(contentsDO);
    }

    /**
     * 由 id 查询文章
     * @param cid 文章 id
     * @return 详细信息
     */
    @Override
    public ContentsDO queryContentByCid(int cid) {
        return this.contentsDAO.queryContentByCid(cid);
    }

    @Autowired
    public void setContentsDAO(ContentsDAO contentsDAO) {
        this.contentsDAO = contentsDAO;
    }
}
