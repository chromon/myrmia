package com.myrmia.service.impl;

import com.myrmia.dao.MetasDAO;
import com.myrmia.model.MetasDO;
import com.myrmia.service.MetasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * metas service impl
 * Created by Ellery on 2018/12/15.
 */
@Service("metasService")
public class MetasServiceImpl implements MetasService {

    private MetasDAO metasDAO;

    /**
     * 添加元信息
     * @param metasDO 元信息
     */
    @Override
    public void saveMetas(MetasDO metasDO) {
        metasDAO.addMetas(metasDO);
    }

    /**
     * 由 id 查询元信息
     * @param mid 元信息 id
     * @return 元信息
     */
    @Override
    public MetasDO queryMetasById(int mid) {
        return metasDAO.queryMetasById(mid);
    }

    /**
     * 删除元信息
     * @param metasDO 元信息
     */
    @Override
    public void deleteMetas(MetasDO metasDO) {
        metasDAO.deleteMetas(metasDO);
    }

    /**
     * 由类型查询元数据
     * @return 元数据信息
     */
    @Override
    public List<MetasDO> queryMetasByType(String metasType) {
        return metasDAO.queryMetasByType(metasType);
    }

    /**
     * 更新元数据信息
     * @param metasDO 元数据信息
     */
    @Override
    public void modifyMetas(MetasDO metasDO) {
        this.metasDAO.updateMetas(metasDO);
    }

    /**
     * 由名称和类型查询数据
     * @param name 名称
     * @param metasType 类型
     * @return 元数据信息
     */
    @Override
    public MetasDO queryMetasByNameAndType(String name, String metasType) {
        return this.metasDAO.queryMetasByNameAndType(name, metasType);
    }

    /**
     * 由数据 id 查询详细信息
     * @param mid 元数据 id
     * @return 元数据信息
     */
    @Override
    public MetasDO queryMetasByMid(int mid) {
        return this.metasDAO.queryMetasByMid(mid);
    }

    @Autowired
    public void setMetasDAO(MetasDAO metasDAO) {
        this.metasDAO = metasDAO;
    }
}
