package com.cpmip.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Zlsg {
    private Integer id;

    private String zlsgId;

    private String construname;

    private String build;

    private String construction;

    private String position;

    private String accident;

    private Date happenTime;

    private Date reportTime;

    private BigDecimal money;

    private String reason;

    private String actions;

    private String repons;

    private Date createTime;

    private Date updateTime;

    public Zlsg(Integer id, String zlsgId, String construname, String build, String construction, String position, String accident, Date happenTime, Date reportTime, BigDecimal money, String reason, String actions, String repons, Date createTime, Date updateTime) {
        this.id = id;
        this.zlsgId = zlsgId;
        this.construname = construname;
        this.build = build;
        this.construction = construction;
        this.position = position;
        this.accident = accident;
        this.happenTime = happenTime;
        this.reportTime = reportTime;
        this.money = money;
        this.reason = reason;
        this.actions = actions;
        this.repons = repons;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Zlsg() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZlsgId() {
        return zlsgId;
    }

    public void setZlsgId(String zlsgId) {
        this.zlsgId = zlsgId == null ? null : zlsgId.trim();
    }

    public String getConstruname() {
        return construname;
    }

    public void setConstruname(String construname) {
        this.construname = construname == null ? null : construname.trim();
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build == null ? null : build.trim();
    }

    public String getConstruction() {
        return construction;
    }

    public void setConstruction(String construction) {
        this.construction = construction == null ? null : construction.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
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

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
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