package com.myrmia.dao;

import com.myrmia.model.RelationshipsDO;

import java.util.List;

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

    /**
     * 由文章 id 和数据 id 查询关系信息
     * @param cid 文章 id
     * @param mid 数据 id
     * @return 关系信息
     */
    RelationshipsDO queryRelationshipsByCidMid(int cid, int mid);

    /**
     * 查询关系数量
     * @param cid 文章 id
     * @param mid 数据 id
     * @return 关系数量
     */
    int queryRelationshipsCount(int cid, int mid);

    /**
     * 查询关系由 mid 分组
     * @return 关系信息
     */
    List<RelationshipsDO> queryRelationshipsByMid(int mid);

    /**
     * 查询关系由 mid 分组
     * @return 关系信息
     */
    List<RelationshipsDO> queryRelationshipsGroupByMid();

    /**
     * 删除关系
     * @param relationshipsDO 关系信息
     */
    void deleteRelationships(RelationshipsDO relationshipsDO);

    /**
     * 更新关系
     * @param relationshipsDO 关系信息
     */
    void updateRelationships(RelationshipsDO relationshipsDO);
}
