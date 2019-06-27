package com.cpmip.pojo;

import java.util.Date;

public class News {
    private Integer id;

    private String title;

    private String content;

    private String operator;

    private Date publishTime;

    private Date createTime;

    private Date updateTime;

    public News(Integer id, String title, String content, String operator, Date publishTime, Date createTime, Date updateTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.operator = operator;
        this.publishTime = publishTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public News() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}