package com.myrmia.dao;

import com.myrmia.model.RelationshipsDO;

/**
 * relationships dao
 * Created by Ellery on 2018/12/30.
 */
public interface RelationshipsDAO {

    /**
     * 添加文章元数据对应关系
     * @param relationshipsDO 关系
     */
    void addRelationships(RelationshipsDO relationshipsDO);
}
