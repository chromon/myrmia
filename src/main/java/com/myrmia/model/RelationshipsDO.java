package com.myrmia.model;

import javax.persistence.*;

/**
 * relationships do
 * Created by Ellery on 2018/11/30.
 */
@Entity
@Table(name = "t_relationships")
public class RelationshipsDO {

    private int rid;

    private int cid;

    private int mid;

    @Id
    @Column(name = "rid", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    @Column(name = "cid", nullable = false, columnDefinition = "integer(10)")
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Column(name = "mid", nullable = false, columnDefinition = "integer(10)")
    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }
}
