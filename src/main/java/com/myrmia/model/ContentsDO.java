package com.myrmia.model;

import javax.persistence.*;

/**
 *  contents do
 * Created by Ellery on 2018/11/12.
 */
@Entity
@Table(name = "t_contents")
public class ContentsDO {

    private int cid;

    private String title;

    private String slug;

    private String thumbImg;

    private long created;

    private long modified;

    private String content;

    private int authorId;

    private String contentType;

    private String status;

    private String fmtType;

    private String tags;

    private String categories;

    private int hits;

    private int commentsNum;

    private int allowComment;

    private int allowPing;

    private int allowFeed;

    @Id
    @Column(name = "cid", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Column(name = "title", nullable = false, columnDefinition = "varchar(255)")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "slug", columnDefinition = "varchar(255) unique")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    @Column(name = "thumb_img", columnDefinition = "varchar(255)")
    public String getThumbImg() {
        return thumbImg;
    }

    public void setThumbImg(String thumbImg) {
        this.thumbImg = thumbImg;
    }

    @Column(name = "created", nullable = false, columnDefinition = "bigint")
    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    @Column(name = "modified", columnDefinition = "bigint")
    public long getModified() {
        return modified;
    }

    public void setModified(long modified) {
        this.modified = modified;
    }

    @Column(name = "content", columnDefinition = "text")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Column(name = "author_id", nullable = false, columnDefinition = "integer(10)")
    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    @Column(name = "content_type", nullable = false, columnDefinition = "varchar(16)")
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Column(name = "status", nullable = false, columnDefinition = "varchar(16)")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "fmt_type", columnDefinition = "varchar(16) default('markdown')")
    public String getFmtType() {
        return fmtType;
    }

    public void setFmtType(String fmtType) {
        this.fmtType = fmtType;
    }

    @Column(name = "tags", columnDefinition = "varchar(200)")
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Column(name = "categories", columnDefinition = "varchar(200)")
    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    @Column(name = "hits", columnDefinition = "integer(10) default(0)")
    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    @Column(name = "comments_num", columnDefinition = "integer(1) default(0)")
    public int getCommentsNum() {
        return commentsNum;
    }

    public void setCommentsNum(int commentsNum) {
        this.commentsNum = commentsNum;
    }

    @Column(name = "allow_comment", columnDefinition = "integer(1) default(1)")
    public int getAllowComment() {
        return allowComment;
    }

    public void setAllowComment(int allowComment) {
        this.allowComment = allowComment;
    }

    @Column(name = "allow_ping", columnDefinition = "integer(1)")
    public int getAllowPing() {
        return allowPing;
    }

    public void setAllowPing(int allowPing) {
        this.allowPing = allowPing;
    }

    @Column(name = "allow_feed", columnDefinition = "integer(1)")
    public int getAllowFeed() {
        return allowFeed;
    }

    public void setAllowFeed(int allowFeed) {
        this.allowFeed = allowFeed;
    }
}
