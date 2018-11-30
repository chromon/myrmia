package com.myrmia.model;

import javax.persistence.*;

/**
 * metas do
 * Created by Ellery on 2018/11/12.
 */
@Entity
@Table(name = "t_metas")
public class MetasDO {

    private int mid;

    private String name;

    private String slug;

    private String metasType;

    private String description;

    private int sort;

    private int parentId;

    @Id
    @Column(name = "mid", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    @Column(name = "name", nullable = false, columnDefinition = "varchar(200)")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "slug", columnDefinition = "varchar(200)")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    @Column(name = "metas_type",nullable = false, columnDefinition = "varchar(32)")
    public String getMetasType() {
        return metasType;
    }

    public void setMetasType(String metasType) {
        this.metasType = metasType;
    }

    @Column(name = "description", columnDefinition = "varchar(255)")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "sort", columnDefinition = "integer(4) default(0)")
    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    @Column(name = "parent_id", columnDefinition = "integer(10) default(0)")
    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
}
