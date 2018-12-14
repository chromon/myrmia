package com.myrmia.dao;

import com.myrmia.model.AttachDO;

/**
 * attach dao
 * Created by Ellery on 2018/12/14.
 */
public interface AttachDAO {

    /**
     * 添加附件
     * @param attachDO 附件信息
     */
    void addAttach(AttachDO attachDO);

    /**
     * 由文件名查询附件信息
     * @param fileName 文件名
     * @return 附件信息
     */
    AttachDO queryAttachByFileName(String fileName);

    /**
     * 删除附件
     * @param attachDO 附件信息
     */
    void deleteAttach(AttachDO attachDO);
}
