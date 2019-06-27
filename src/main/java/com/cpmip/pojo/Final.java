package com.cpmip.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Final {
    private Integer id;

    private Integer finalId;

    private String construname;

    private String position;

    private String area;

    private String type;

    private BigDecimal money;

    private String startid;

    private Date startTime;

    private Date finalTime;

    private String build;

    private String buildopinion;

    private String construction;

    private String constructionopinion;

    private String qsadname;

    private String qsadopinion;

    private Date submitTime;

    private Date createTime;

    private Date updateTime;

    public Final(Integer id, Integer finalId, String construname, String position, String area, String type, BigDecimal money, String startid, Date startTime, Date finalTime, String build, String buildopinion, String construction, String constructionopinion, String qsadname, String qsadopinion, Date submitTime, Date createTime, Date updateTime) {
        this.id = id;
        this.finalId = finalId;
        this.construname = construname;
        this.position = position;
        this.area = area;
        this.type = type;
        this.money = money;
        this.startid = startid;
        this.startTime = startTime;
        this.finalTime = finalTime;
        this.build = build;
        this.buildopinion = buildopinion;
        this.construction = construction;
        this.constructionopinion = constructionopinion;
        this.qsadname = qsadname;
        this.qsadopinion = qsadopinion;
        this.submitTime = submitTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Final() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFinalId() {
        return finalId;
    }

    public void setFinalId(Integer finalId) {
        this.finalId = finalId;
    }

    public String getConstruname() {
        return construname;
    }

    public void setConstruname(String construname) {
        this.construname = construname == null ? null : construname.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getStartid() {
        return startid;
    }

    public void setStartid(String startid) {
        this.startid = startid == null ? null : startid.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getFinalTime() {
        return finalTime;
    }

    public void setFinalTime(Date finalTime) {
        this.finalTime = finalTime;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build == null ? null : build.trim();
    }

    public String getBuildopinion() {
        return buildopinion;
    }

    public void setBuildopinion(String buildopinion) {
        this.buildopinion = buildopinion == null ? null : buildopinion.trim();
    }

    public String getConstruction() {
        return construction;
    }

    public void setConstruction(String construction) {
        this.construction = construction == null ? null : construction.trim();
    }

    public String getConstructionopinion() {
        return constructionopinion;
    }

    public void setConstructionopinion(String constructionopinion) {
        this.constructionopinion = constructionopinion == null ? null : constructionopinion.trim();
    }

    public String getQsadname() {
        return qsadname;
    }

    public void setQsadname(String qsadname) {
        this.qsadname = qsadname == null ? null : qsadname.trim();
    }

    public String getQsadopinion() {
        return qsadopinion;
    }

    public void setQsadopinion(String qsadopinion) {
        this.qsadopinion = qsadopinion == null ? null : qsadopinion.trim();
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
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