package com.cpmip.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Aqsg {
    private Integer id;

    private String construname;

    private String construction;

    private String build;

    private String position;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date happenTime;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reportTime;

    private String reason;

    private String action;

    private Date createTime;

    private Date updateTime;

    public Aqsg(Integer id, String construname, String construction, String build, String position, Date happenTime, Date reportTime, String reason, String action, Date createTime, Date updateTime) {
        this.id = id;
        this.construname = construname;
        this.construction = construction;
        this.build = build;
        this.position = position;
        this.happenTime = happenTime;
        this.reportTime = reportTime;
        this.reason = reason;
        this.action = action;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Aqsg() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConstruname() {
        return construname;
    }

    public void setConstruname(String construname) {
        this.construname = construname == null ? null : construname.trim();
    }

    public String getConstruction() {
        return construction;
    }

    public void setConstruction(String construction) {
        this.construction = construction == null ? null : construction.trim();
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build == null ? null : build.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Date getHappenTime() {
        return happenTime;
    }

    public void setHappenTime(Date happenTime) {
        this.happenTime = happenTime;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
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