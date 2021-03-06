package com.myrmia.dto;

/**
 * article dto
 * Created by Ellery on 2018/12/19.
 */
public class ArticleDTO {

    private int cid;

    private String articleTitle;

    private String articleSlug;

    private String articleTags;

    private String articleCategory;

    private String articleContent;

    private boolean allowComment;

    private boolean allowPing;

    private boolean allowFeed;

    private boolean edit;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleSlug() {
        return articleSlug;
    }

    public void setArticleSlug(String articleSlug) {
        this.articleSlug = articleSlug;
    }

    public String getArticleTags() {
        return articleTags;
    }

    public void setArticleTags(String articleTags) {
        this.articleTags = articleTags;
    }

    public String getArticleCategory() {
        return articleCategory;
    }

    public void setArticleCategory(String articleCategory) {
        this.articleCategory = articleCategory;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public boolean isAllowComment() {
        return allowComment;
    }

    public void setAllowComment(boolean allowComment) {
        this.allowComment = allowComment;
    }

    public boolean isAllowPing() {
        return allowPing;
    }

    public void setAllowPing(boolean allowPing) {
        this.allowPing = allowPing;
    }

    public boolean isAllowFeed() {
        return allowFeed;
    }

    public void setAllowFeed(boolean allowFeed) {
        this.allowFeed = allowFeed;
    }

    public boolean isEdit() {
        return edit;
    }

    public void setEdit(boolean edit) {
        this.edit = edit;
    }
}
