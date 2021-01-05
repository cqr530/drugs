package com.lianxi.drugs.pojo;

import java.util.Date;

public class CreditOrder {
    private Integer coId;

    private String coNumber;

    private String coName;

    private Integer hospitalId;

    private String coContacts;

    private String coPhone;

    private String coCreatepeople;

    private Date coCreatetime;

    private Date coInputtime;

    private String coRemark;

    private Integer coState;

    public Integer getCoId() {
        return coId;
    }

    public void setCoId(Integer coId) {
        this.coId = coId;
    }

    public String getCoNumber() {
        return coNumber;
    }

    public void setCoNumber(String coNumber) {
        this.coNumber = coNumber == null ? null : coNumber.trim();
    }

    public String getCoName() {
        return coName;
    }

    public void setCoName(String coName) {
        this.coName = coName == null ? null : coName.trim();
    }

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getCoContacts() {
        return coContacts;
    }

    public void setCoContacts(String coContacts) {
        this.coContacts = coContacts == null ? null : coContacts.trim();
    }

    public String getCoPhone() {
        return coPhone;
    }

    public void setCoPhone(String coPhone) {
        this.coPhone = coPhone == null ? null : coPhone.trim();
    }

    public String getCoCreatepeople() {
        return coCreatepeople;
    }

    public void setCoCreatepeople(String coCreatepeople) {
        this.coCreatepeople = coCreatepeople == null ? null : coCreatepeople.trim();
    }

    public Date getCoCreatetime() {
        return coCreatetime;
    }

    public void setCoCreatetime(Date coCreatetime) {
        this.coCreatetime = coCreatetime;
    }

    public Date getCoInputtime() {
        return coInputtime;
    }

    public void setCoInputtime(Date coInputtime) {
        this.coInputtime = coInputtime;
    }

    public String getCoRemark() {
        return coRemark;
    }

    public void setCoRemark(String coRemark) {
        this.coRemark = coRemark == null ? null : coRemark.trim();
    }

    public Integer getCoState() {
        return coState;
    }

    public void setCoState(Integer coState) {
        this.coState = coState;
    }
}