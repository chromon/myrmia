package com.myrmia.service;

import com.myrmia.model.RelationshipsDO;

/**
 * relationships service
 * Created by Ellery on 2018/12/30.
 */
public interface RelationshipsService {

    /**
     * 添加文章元数据对应关系
     * @param relationshipsDO 关系
     */
    void saveRelationships(RelationshipsDO relationshipsDO);
}
