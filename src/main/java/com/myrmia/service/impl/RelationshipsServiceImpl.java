package com.myrmia.service.impl;

import com.myrmia.dao.RelationshipsDAO;
import com.myrmia.model.RelationshipsDO;
import com.myrmia.service.RelationshipsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Autowired
    public void setRelationshipsDAO(RelationshipsDAO relationshipsDAO) {
        this.relationshipsDAO = relationshipsDAO;
    }
}
