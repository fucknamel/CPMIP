package com.cpmip.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class Report {
    private Integer id;

    private String construname;

    private String position;

    private BigDecimal money;

    private String area;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reportTime;

    private String buildname;

    private String builder;

    private String builderPhone;

    private String construction;

    private String constructioner;

    private String constructionerPhone;

    private String qsadname;

    private String qsader;

    private String qsaderPhone;

    private String standard1;

    private String standard2;

    private String standard3;

    private Date createTime;

    private Date updateTime;

    public Report(Integer id, String construname, String position, BigDecimal money, String area, Date reportTime, String buildname, String builder, String builderPhone, String construction, String constructioner, String constructionerPhone, String qsadname, String qsader, String qsaderPhone, String standard1, String standard2, String standard3, Date createTime, Date updateTime) {
        this.id = id;
        this.construname = construname;
        this.position = position;
        this.money = money;
        this.area = area;
        this.reportTime = reportTime;
        this.buildname = buildname;
        this.builder = builder;
        this.builderPhone = builderPhone;
        this.construction = construction;
        this.constructioner = constructioner;
        this.constructionerPhone = constructionerPhone;
        this.qsadname = qsadname;
        this.qsader = qsader;
        this.qsaderPhone = qsaderPhone;
        this.standard1 = standard1;
        this.standard2 = standard2;
        this.standard3 = standard3;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Report() {
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public String getBuildname() {
        return buildname;
    }

    public void setBuildname(String buildname) {
        this.buildname = buildname == null ? null : buildname.trim();
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder == null ? null : builder.trim();
    }

    public String getBuilderPhone() {
        return builderPhone;
    }

    public void setBuilderPhone(String builderPhone) {
        this.builderPhone = builderPhone == null ? null : builderPhone.trim();
    }

    public String getConstruction() {
        return construction;
    }

    public void setConstruction(String construction) {
        this.construction = construction == null ? null : construction.trim();
    }

    public String getConstructioner() {
        return constructioner;
    }

    public void setConstructioner(String constructioner) {
        this.constructioner = constructioner == null ? null : constructioner.trim();
    }

    public String getConstructionerPhone() {
        return constructionerPhone;
    }

    public void setConstructionerPhone(String constructionerPhone) {
        this.constructionerPhone = constructionerPhone == null ? null : constructionerPhone.trim();
    }

    public String getQsadname() {
        return qsadname;
    }

    public void setQsadname(String qsadname) {
        this.qsadname = qsadname == null ? null : qsadname.trim();
    }

    public String getQsader() {
        return qsader;
    }

    public void setQsader(String qsader) {
        this.qsader = qsader == null ? null : qsader.trim();
    }

    public String getQsaderPhone() {
        return qsaderPhone;
    }

    public void setQsaderPhone(String qsaderPhone) {
        this.qsaderPhone = qsaderPhone == null ? null : qsaderPhone.trim();
    }

    public String getStandard1() {
        return standard1;
    }

    public void setStandard1(String standard1) {
        this.standard1 = standard1 == null ? null : standard1.trim();
    }

    public String getStandard2() {
        return standard2;
    }

    public void setStandard2(String standard2) {
        this.standard2 = standard2 == null ? null : standard2.trim();
    }

    public String getStandard3() {
        return standard3;
    }

    public void setStandard3(String standard3) {
        this.standard3 = standard3 == null ? null : standard3.trim();
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