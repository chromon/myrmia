package com.myrmia.model;

import javax.persistence.*;

/**
 * logs do
 * Created by Ellery on 2018/11/12.
 */
@Entity
@Table(name = "t_logs")
public class LogsDO {

    private int id;

    private String action;

    private String data;

    private int author_id;

    private String ip;

    private long created;

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "action", nullable = false, columnDefinition = "varchar(100)")
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Column(name = "data", columnDefinition = "varchar(2000)")
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Column(name = "author_id", nullable = false, columnDefinition = "integer(10)")
    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    @Column(name = "ip", columnDefinition = "varchar(20)")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Column(name = "created", nullable = false, columnDefinition = "bigint")
    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }
}
