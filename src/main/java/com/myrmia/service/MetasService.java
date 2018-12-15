package com.myrmia.service;

import com.myrmia.model.MetasDO;

import java.util.List;

/**
 * metas service
 * Created by Ellery on 2018/12/15.
 */
public interface MetasService {

    /**
     * 添加元信息
     * @param metasDO 元信息
     */
    void saveMetas(MetasDO metasDO);

    /**
     * 由 id 查询元信息
     * @param mid 元信息 id
     * @return 元信息
     */
    MetasDO queryMetasById(int mid);

    /**
     * 删除元信息
     * @param metasDO 元信息
     */
    void deleteMetas(MetasDO metasDO);

    /**
     * 由类型查询元数据
     * @return 元数据信息
     */
    List<MetasDO> queryMetasByType(String metasType);

    /**
     * 更新元数据信息
     * @param metasDO 元数据信息
     */
    void updateMetas(MetasDO metasDO);
}
