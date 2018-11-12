package com.myrmia.model;

/**
 * metas do
 * Created by Ellery on 2018/11/12.
 */
public class MetasDO {

    private int mid;

    private String name;

    private String slug;

    private String metasType;

    private String description;

    private int sort;

    private int parentId;

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getMetasType() {
        return metasType;
    }

    public void setMetasType(String metasType) {
        this.metasType = metasType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
}
