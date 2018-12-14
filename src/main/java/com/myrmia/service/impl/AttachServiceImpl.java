package com.myrmia.service.impl;

import com.myrmia.dao.AttachDAO;
import com.myrmia.model.AttachDO;
import com.myrmia.service.AttachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * attach service impl
 * Created by Ellery on 2018/12/14.
 */
@Service("attachService")
public class AttachServiceImpl implements AttachService {

    private AttachDAO attachDAO;

    /**
     * 添加附件
     * @param attachDO 附件信息
     */
    @Override
    public void saveAttach(AttachDO attachDO) {
        attachDAO.addAttach(attachDO);
    }

    /**
     * 由文件名查询附件信息
     * @param fileName 文件名
     * @return 附件信息
     */
    @Override
    public AttachDO queryAttachByFileName(String fileName) {
        return this.attachDAO.queryAttachByFileName(fileName);
    }

    /**
     * 删除附件
     * @param attachDO 附件信息
     */
    @Override
    public void deleteAttach(AttachDO attachDO) {
        this.attachDAO.deleteAttach(attachDO);
    }

    @Autowired
    public void setAttachDAO(AttachDAO attachDAO) {
        this.attachDAO = attachDAO;
    }
}
