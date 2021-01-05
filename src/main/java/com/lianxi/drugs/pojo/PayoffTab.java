package com.lianxi.drugs.pojo;

import java.util.Date;

public class PayoffTab {
    private Integer payoffTabId;

    private String payoffTabNum;

    private String payoffTabName;

    private String hospitalId;

    private String contacts;

    private String contactsPhone;

    private Date createTime;

    private Date inputTime;

    private String payoffTabPostil;

    private Integer payoffTabStatus;

    private Float payoffPrice;

    public Integer getPayoffTabId() {
        return payoffTabId;
    }

    public void setPayoffTabId(Integer payoffTabId) {
        this.payoffTabId = payoffTabId;
    }

    public String getPayoffTabNum() {
        return payoffTabNum;
    }

    public void setPayoffTabNum(String payoffTabNum) {
        this.payoffTabNum = payoffTabNum == null ? null : payoffTabNum.trim();
    }

    public String getPayoffTabName() {
        return payoffTabName;
    }

    public void setPayoffTabName(String payoffTabName) {
        this.payoffTabName = payoffTabName == null ? null : payoffTabName.trim();
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId == null ? null : hospitalId.trim();
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public String getContactsPhone() {
        return contactsPhone;
    }

    public void setContactsPhone(String contactsPhone) {
        this.contactsPhone = contactsPhone == null ? null : contactsPhone.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    public String getPayoffTabPostil() {
        return payoffTabPostil;
    }

    public void setPayoffTabPostil(String payoffTabPostil) {
        this.payoffTabPostil = payoffTabPostil == null ? null : payoffTabPostil.trim();
    }

    public Integer getPayoffTabStatus() {
        return payoffTabStatus;
    }

    public void setPayoffTabStatus(Integer payoffTabStatus) {
        this.payoffTabStatus = payoffTabStatus;
    }

    public Float getPayoffPrice() {
        return payoffPrice;
    }

    public void setPayoffPrice(Float payoffPrice) {
        this.payoffPrice = payoffPrice;
    }
}