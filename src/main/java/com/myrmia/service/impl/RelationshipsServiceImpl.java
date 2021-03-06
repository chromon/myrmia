package com.myrmia.service.impl;

import com.myrmia.dao.RelationshipsDAO;
import com.myrmia.model.RelationshipsDO;
import com.myrmia.service.RelationshipsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * relationships service impl
 * Created by Ellery on 2018/12/30.
 */
@Service("relationshipsService")
public class RelationshipsServiceImpl implements RelationshipsService {

    private RelationshipsDAO relationshipsDAO;

    /**
     * 添加文章元数据对应关系
     * @param relationshipsDO 关系
     */
    @Override
    public void saveRelationships(RelationshipsDO relationshipsDO) {
        this.relationshipsDAO.addRelationships(relationshipsDO);
    }

    /**
     * 由文章 id 和数据 id 查询关系信息
     * @param cid 文章 id
     * @param mid 数据 id
     * @return 关系信息
     */
    @Override
    public RelationshipsDO queryRelationshipsByCidMid(int cid, int mid) {
        return this.relationshipsDAO.queryRelationshipsByCidMid(cid, mid);
    }

    /**
     * 查询关系数量
     * @param cid 文章 id
     * @param mid 数据 id
     * @return 关系数量
     */
    @Override
    public int queryRelationshipsCount(int cid, int mid) {
        return this.relationshipsDAO.queryRelationshipsCount(cid, mid);
    }

    /**
     * 查询关系由 mid 分组
     * @return 关系信息
     */
    @Override
    public List<RelationshipsDO> queryRelationshipsByMid(int mid) {
        return this.relationshipsDAO.queryRelationshipsByMid(mid);
    }

    /**
     * 查询关系由 mid 分组
     * @return 关系信息
     */
    @Override
    public List<RelationshipsDO> queryRelationshipsGroupByMid() {
        return this.relationshipsDAO.queryRelationshipsGroupByMid();
    }

    /**
     * 删除关系
     * @param relationshipsDO 关系信息
     */
    @Override
    public void deleteRelationships(RelationshipsDO relationshipsDO) {
        this.relationshipsDAO.deleteRelationships(relationshipsDO);
    }

    /**
     * 更新关系
     * @param relationshipsDO 关系信息
     */
    @Override
    public void modifyRelationships(RelationshipsDO relationshipsDO) {
        this.relationshipsDAO.updateRelationships(relationshipsDO);
    }

    @Autowired
    public void setRelationshipsDAO(RelationshipsDAO relationshipsDAO) {
        this.relationshipsDAO = relationshipsDAO;
    }
}
