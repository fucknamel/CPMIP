package com.cpmip.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class Start {
    private Integer id;

    private String construname;

    private String position;

    private String area;

    private String type;

    private BigDecimal money;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date finalTime;

    private String builder;

    private String buildername;

    private String builderPhone;

    private String construction;

    private String constructioner;

    private String constructionerPhone;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date submitTime;

    private Date createTime;

    private Date updateTime;

    public Start(Integer id, String construname, String position, String area, String type, BigDecimal money, Date startTime, Date finalTime, String builder, String buildername, String builderPhone, String construction, String constructioner, String constructionerPhone, Date submitTime, Date createTime, Date updateTime) {
        this.id = id;
        this.construname = construname;
        this.position = position;
        this.area = area;
        this.type = type;
        this.money = money;
        this.startTime = startTime;
        this.finalTime = finalTime;
        this.builder = builder;
        this.buildername = buildername;
        this.builderPhone = builderPhone;
        this.construction = construction;
        this.constructioner = constructioner;
        this.constructionerPhone = constructionerPhone;
        this.submitTime = submitTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Start() {
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

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder == null ? null : builder.trim();
    }

    public String getBuildername() {
        return buildername;
    }

    public void setBuildername(String buildername) {
        this.buildername = buildername == null ? null : buildername.trim();
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