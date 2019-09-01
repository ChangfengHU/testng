package com.example.demo.pojo;
import java.util.Date;
import javax.persistence.*;
@Table(name = "article")
public class Article {
    @Id
    private Integer id;

    @Column(name = "creat_time")
    private Date creatTime;

    @Column(name = "gmt_name")
    private String gmtName;

    @Column(name = "gmt_time")
    private Date gmtTime;

    @Column(name = "creat_name")
    private String creatName;

    private String title;

    private String author;

    private String avatar;

    @Column(name = "pub_time")
    private Date pubTime;

    @Column(name = "origin_url")
    private String originUrl;

    @Column(name = "article_id")
    private String articleId;

    private String content;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return creat_time
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * @param creatTime
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    /**
     * @return gmt_name
     */
    public String getGmtName() {
        return gmtName;
    }

    /**
     * @param gmtName
     */
    public void setGmtName(String gmtName) {
        this.gmtName = gmtName;
    }

    /**
     * @return gmt_time
     */
    public Date getGmtTime() {
        return gmtTime;
    }

    /**
     * @param gmtTime
     */
    public void setGmtTime(Date gmtTime) {
        this.gmtTime = gmtTime;
    }

    /**
     * @return creat_name
     */
    public String getCreatName() {
        return creatName;
    }

    /**
     * @param creatName
     */
    public void setCreatName(String creatName) {
        this.creatName = creatName;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * @param avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * @return pub_time
     */
    public Date getPubTime() {
        return pubTime;
    }

    /**
     * @param pubTime
     */
    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    /**
     * @return origin_url
     */
    public String getOriginUrl() {
        return originUrl;
    }

    /**
     * @param originUrl
     */
    public void setOriginUrl(String originUrl) {
        this.originUrl = originUrl;
    }

    /**
     * @return article_id
     */
    public String getArticleId() {
        return articleId;
    }

    /**
     * @param articleId
     */
    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", creatTime=" + creatTime +
                ", gmtName='" + gmtName + '\'' +
                ", gmtTime=" + gmtTime +
                ", creatName='" + creatName + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", avatar='" + avatar + '\'' +
                ", pubTime=" + pubTime +
                ", originUrl='" + originUrl + '\'' +
                ", articleId='" + articleId + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}