package com.cpmip.pojo;

import java.util.Date;

public class Aqsg {
    private Integer id;

    private Integer aqsgId;

    private String construname;

    private String construction;

    private String accident;

    private Date happenTime;

    private Date reportTime;

    private String reason;

    private String actions;

    private String repons;

    private Date createTime;

    private Date updateTime;

    public Aqsg(Integer id, Integer aqsgId, String construname, String construction, String accident, Date happenTime, Date reportTime, String reason, String actions, String repons, Date createTime, Date updateTime) {
        this.id = id;
        this.aqsgId = aqsgId;
        this.construname = construname;
        this.construction = construction;
        this.accident = accident;
        this.happenTime = happenTime;
        this.reportTime = reportTime;
        this.reason = reason;
        this.actions = actions;
        this.repons = repons;
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

    public Integer getAqsgId() {
        return aqsgId;
    }

    public void setAqsgId(Integer aqsgId) {
        this.aqsgId = aqsgId;
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

    public String getAccident() {
        return accident;
    }

    public void setAccident(String accident) {
        this.accident = accident == null ? null : accident.trim();
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

    public String getActions() {
        return actions;
    }

    public void setActions(String actions) {
        this.actions = actions == null ? null : actions.trim();
    }

    public String getRepons() {
        return repons;
    }

    public void setRepons(String repons) {
        this.repons = repons == null ? null : repons.trim();
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