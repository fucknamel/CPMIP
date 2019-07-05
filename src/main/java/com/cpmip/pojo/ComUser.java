package com.cpmip.pojo;

import java.util.Date;

public class ComUser {
    private Integer id;

    private Integer company;

    private String ecotype;

    private String name;

    private String password;

    private String province;

    private String city;

    private String district;

    private String street;

    private String detailed;

    private String orgcode;

    private String legaler;

    private String legalerPhone;

    private String contracter;

    private String contracterPhone;

    private String question;

    private String answer;

    private Date createTime;

    private Date updateTime;

    public ComUser(Integer id, Integer company, String ecotype, String name, String password, String province, String city, String district, String street, String detailed, String orgcode, String legaler, String legalerPhone, String contracter, String contracterPhone, String question, String answer, Date createTime, Date updateTime) {
        this.id = id;
        this.company = company;
        this.ecotype = ecotype;
        this.name = name;
        this.password = password;
        this.province = province;
        this.city = city;
        this.district = district;
        this.street = street;
        this.detailed = detailed;
        this.orgcode = orgcode;
        this.legaler = legaler;
        this.legalerPhone = legalerPhone;
        this.contracter = contracter;
        this.contracterPhone = contracterPhone;
        this.question = question;
        this.answer = answer;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public ComUser() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompany() {
        return company;
    }

    public void setCompany(Integer company) {
        this.company = company;
    }

    public String getEcotype() {
        return ecotype;
    }

    public void setEcotype(String ecotype) {
        this.ecotype = ecotype == null ? null : ecotype.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public String getDetailed() {
        return detailed;
    }

    public void setDetailed(String detailed) {
        this.detailed = detailed == null ? null : detailed.trim();
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode == null ? null : orgcode.trim();
    }

    public String getLegaler() {
        return legaler;
    }

    public void setLegaler(String legaler) {
        this.legaler = legaler == null ? null : legaler.trim();
    }

    public String getLegalerPhone() {
        return legalerPhone;
    }

    public void setLegalerPhone(String legalerPhone) {
        this.legalerPhone = legalerPhone == null ? null : legalerPhone.trim();
    }

    public String getContracter() {
        return contracter;
    }

    public void setContracter(String contracter) {
        this.contracter = contracter == null ? null : contracter.trim();
    }

    public String getContracterPhone() {
        return contracterPhone;
    }

    public void setContracterPhone(String contracterPhone) {
        this.contracterPhone = contracterPhone == null ? null : contracterPhone.trim();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
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