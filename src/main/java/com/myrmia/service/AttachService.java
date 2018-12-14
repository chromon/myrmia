package com.myrmia.service;

import com.myrmia.model.AttachDO;

/**
 * attach service
 * Created by Ellery on 2018/12/14.
 */
public interface AttachService {

    /**
     * 添加附件
     * @param attachDO 附件信息
     */
    void saveAttach(AttachDO attachDO);

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
