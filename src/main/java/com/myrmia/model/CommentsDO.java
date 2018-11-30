package com.myrmia.model;

import javax.persistence.*;

/**
 * comments do
 * Created by Ellery on 2018/11/12.
 */
@Entity
@Table(name = "t_comments")
public class CommentsDO {

    private int coid;

    private int cid;

    private int created;

    private String authorName;

    private int authorId;

    private int ownerId;

    private String mail;

    private String url;

    private String ip;

    private String agent;

    private String content;

    private String commentType;

    private String status;

    private int parentId;

    @Id
    @Column(name = "coid", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getCoid() {
        return coid;
    }

    public void setCoid(int coid) {
        this.coid = coid;
    }

    @Column(name = "cid", nullable = false, columnDefinition = "integer default(0)")
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Column(name = "created",nullable = false, columnDefinition = "integer(10)")
    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    @Column(name = "author_name", nullable = false, columnDefinition = "varchar(200)")
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Column(name = "author_id", columnDefinition = "integer(10) default (0)")
    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    @Column(name = "owner_id", columnDefinition = "integer(10) default(0)")
    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    @Column(name = "mail", nullable = false, columnDefinition = "varchar(200)")
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Column(name = "url", columnDefinition = "varchar(200)")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Column(name = "ip", columnDefinition = "varchar(64)")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Column(name = "agent", columnDefinition = "varchar(200)")
    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    @Column(name = "content", nullable = false, columnDefinition = "text")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Column(name = "comment_type", columnDefinition = "varchar(16)")
    public String getCommentType() {
        return commentType;
    }

    public void setCommentType(String commentType) {
        this.commentType = commentType;
    }

    @Column(name = "status", columnDefinition = "varchar(16)")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "parent_id", columnDefinition = "integer(10) default (0)")
    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
}
