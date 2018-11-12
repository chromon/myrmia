package com.myrmia.model;

/**
 *  contents do
 * Created by Ellery on 2018/11/12.
 */
public class ContentsDO {

    private int cid;

    private String title;

    private String slug;

    private String thumbImg;

    private int created;

    private int modified;

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

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getThumbImg() {
        return thumbImg;
    }

    public void setThumbImg(String thumbImg) {
        this.thumbImg = thumbImg;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public int getModified() {
        return modified;
    }

    public void setModified(int modified) {
        this.modified = modified;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFmtType() {
        return fmtType;
    }

    public void setFmtType(String fmtType) {
        this.fmtType = fmtType;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getCommentsNum() {
        return commentsNum;
    }

    public void setCommentsNum(int commentsNum) {
        this.commentsNum = commentsNum;
    }

    public int getAllowComment() {
        return allowComment;
    }

    public void setAllowComment(int allowComment) {
        this.allowComment = allowComment;
    }

    public int getAllowPing() {
        return allowPing;
    }

    public void setAllowPing(int allowPing) {
        this.allowPing = allowPing;
    }

    public int getAllowFeed() {
        return allowFeed;
    }

    public void setAllowFeed(int allowFeed) {
        this.allowFeed = allowFeed;
    }
}
