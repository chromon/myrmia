package com.myrmia.dao.impl;

import com.myrmia.dao.MetasDAO;
import com.myrmia.model.MetasDO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 * Created by Ellery on 2018/12/15.
 */
@Repository
public class MetasDAOImpl implements MetasDAO {

    @Resource
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    /**
     * 添加元信息
     * @param metasDO 元信息
     */
    @Override
    public void addMetas(MetasDO metasDO) {
        this.getSession().save(metasDO);
    }

    /**
     * 由 id 查询元信息
     * @param mid 元信息 id
     * @return 元信息
     */
    @Override
    public MetasDO queryMetasById(int mid) {
        String sql = "from MetasDO m where m.mid =:mid";
        Query query = this.getSession().createQuery(sql);
        query.setParameter("mid", mid);
        return (MetasDO) query.uniqueResult();
    }

    /**
     * 删除元信息
     * @param metasDO 元信息
     */
    @Override
    public void deleteMetas(MetasDO metasDO) {
        this.getSession().delete(metasDO);
    }

    /**
     * 由类型查询元数据
     * @return 元数据信息
     */
    @Override
    public List<MetasDO> queryMetasByType(String metasType) {
        String sql = "from MetasDO m where m.metasType =:metasType";
        Query query = this.getSession().createQuery(sql);
        query.setParameter("metasType", metasType);
        return query.list();
    }

    /**
     * 更新元数据信息
     * @param metasDO 元数据信息
     */
    @Override
    public void updateMetas(MetasDO metasDO) {
        this.getSession().update(metasDO);
    }

    /**
     * 由名称和类型查询数据
     * @param name 名称
     * @param metasType 类型
     * @return 元数据信息
     */
    @Override
    public MetasDO queryMetasByNameAndType(String name, String metasType) {
        String sql = "from MetasDO m where m.name =:name and m.metasType =:metasType";
        Query query = this.getSession().createQuery(sql);
        query.setParameter("name", name);
        query.setParameter("metasType", metasType);
        return (MetasDO) query.uniqueResult();
    }
}
