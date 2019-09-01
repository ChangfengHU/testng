package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Material {
    @Id
    private Integer id;

    @Column(name = "creat_time")
    private Date creatTime;

    @Column(name = "creat_name")
    private String creatName;

    @Column(name = "gmt_time")
    private Date gmtTime;

    @Column(name = "gmt_name")
    private String gmtName;

    private String title;

    private String tag;

    private String status;

    private String type;

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
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    /**
     * @param tag
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
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
        return "Material{" +
                "id=" + id +
                ", creatTime=" + creatTime +
                ", creatName='" + creatName + '\'' +
                ", gmtTime=" + gmtTime +
                ", gmtName='" + gmtName + '\'' +
                ", title='" + title + '\'' +
                ", tag='" + tag + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}