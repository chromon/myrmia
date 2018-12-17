package com.myrmia.service.impl;

import com.myrmia.dao.ContentsDAO;
import com.myrmia.model.ContentsDO;
import com.myrmia.service.ContentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * contents service impl
 * Created by Ellery on 2018/12/17.
 */
@Service("contentsService")
public class ContentsServiceImpl implements ContentsService {

    private ContentsDAO contentsDAO;

    @Override
    public void saveContents(ContentsDO contentsDO) {
        this.contentsDAO.addContents(contentsDO);
    }

    @Autowired
    public void setContentsDAO(ContentsDAO contentsDAO) {
        this.contentsDAO = contentsDAO;
    }
}
