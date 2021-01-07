package com.lianxi.drugs.pojo;

public class Supplier {
    private Integer companyId;

    private String companyName;

    private String companyTelPeople;

    private String companyTelPhone;

    private String companyBussArea;

    private String companyAddr;

    private String companyLegalPerson;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyTelPeople() {
        return companyTelPeople;
    }

    public void setCompanyTelPeople(String companyTelPeople) {
        this.companyTelPeople = companyTelPeople == null ? null : companyTelPeople.trim();
    }

    public String getCompanyTelPhone() {
        return companyTelPhone;
    }

    public void setCompanyTelPhone(String companyTelPhone) {
        this.companyTelPhone = companyTelPhone == null ? null : companyTelPhone.trim();
    }

    public String getCompanyBussArea() {
        return companyBussArea;
    }

    public void setCompanyBussArea(String companyBussArea) {
        this.companyBussArea = companyBussArea == null ? null : companyBussArea.trim();
    }

    public String getCompanyAddr() {
        return companyAddr;
    }

    public void setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr == null ? null : companyAddr.trim();
    }

    public String getCompanyLegalPerson() {
        return companyLegalPerson;
    }

    public void setCompanyLegalPerson(String companyLegalPerson) {
        this.companyLegalPerson = companyLegalPerson == null ? null : companyLegalPerson.trim();
    }
}