package com.myrmia.dao.impl;

import com.myrmia.dao.AttachDAO;
import com.myrmia.model.AttachDO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * attach dao impl
 * Created by Ellery on 2018/12/14.
 */
@Repository
public class AttachDAOImpl implements AttachDAO {

    @Resource
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    /**
     * 添加附件
     * @param attachDO 附件信息
     */
    @Override
    public void addAttach(AttachDO attachDO) {
        this.getSession().save(attachDO);
    }

    /**
     * 由文件名查询附件信息
     * @param fileName 文件名
     * @return 附件信息
     */
    @Override
    public AttachDO queryAttachByFileName(String fileName) {
        String sql = "from AttachDO a where a.fileName =:fileName";
        Query query = this.getSession().createQuery(sql);
        query.setParameter("fileName", fileName);
        return (AttachDO) query.uniqueResult();
    }

    /**
     * 删除附件
     * @param attachDO 附件信息
     */
    @Override
    public void deleteAttach(AttachDO attachDO) {
        this.getSession().delete(attachDO);
    }
}
