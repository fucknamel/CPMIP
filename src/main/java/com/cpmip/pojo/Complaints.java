package com.cpmip.pojo;

import java.util.Date;

public class Complaints {
    private Integer id;

    private String complaintsId;

    private String construname;

    private String position;

    private String buildname;

    private String construction;

    private String reason;

    private Date complaintsTime;

    private String feedback;

    private String record;

    private Integer deal;

    private Integer examine;

    private Integer down;

    private Date createTime;

    private Date updateTime;

    public Complaints(Integer id, String complaintsId, String construname, String position, String buildname, String construction, String reason, Date complaintsTime, String feedback, String record, Integer deal, Integer examine, Integer down, Date createTime, Date updateTime) {
        this.id = id;
        this.complaintsId = complaintsId;
        this.construname = construname;
        this.position = position;
        this.buildname = buildname;
        this.construction = construction;
        this.reason = reason;
        this.complaintsTime = complaintsTime;
        this.feedback = feedback;
        this.record = record;
        this.deal = deal;
        this.examine = examine;
        this.down = down;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Complaints() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComplaintsId() {
        return complaintsId;
    }

    public void setComplaintsId(String complaintsId) {
        this.complaintsId = complaintsId == null ? null : complaintsId.trim();
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

    public String getBuildname() {
        return buildname;
    }

    public void setBuildname(String buildname) {
        this.buildname = buildname == null ? null : buildname.trim();
    }

    public String getConstruction() {
        return construction;
    }

    public void setConstruction(String construction) {
        this.construction = construction == null ? null : construction.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Date getComplaintsTime() {
        return complaintsTime;
    }

    public void setComplaintsTime(Date complaintsTime) {
        this.complaintsTime = complaintsTime;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback == null ? null : feedback.trim();
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record == null ? null : record.trim();
    }

    public Integer getDeal() {
        return deal;
    }

    public void setDeal(Integer deal) {
        this.deal = deal;
    }

    public Integer getExamine() {
        return examine;
    }

    public void setExamine(Integer examine) {
        this.examine = examine;
    }

    public Integer getDown() {
        return down;
    }

    public void setDown(Integer down) {
        this.down = down;
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