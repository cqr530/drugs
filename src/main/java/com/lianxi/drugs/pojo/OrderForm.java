package com.lianxi.drugs.pojo;

import java.util.Date;

public class OrderForm {
    private Integer orId;

    private String orCode;

    private Integer orHospId;

    private String orUserId;

    private String orBuynameId;

    private Date orCreatetime;

    private Date orUpdatetime;

    private Date orSubmittime;

    private String orRemark;

    private Integer orType;

    private Integer orAuditor;

    private String orAuditopinion;

    private Date orAuditTime;

    private Integer orState;

    public Integer getOrId() {
        return orId;
    }

    public void setOrId(Integer orId) {
        this.orId = orId;
    }

    public String getOrCode() {
        return orCode;
    }

    public void setOrCode(String orCode) {
        this.orCode = orCode == null ? null : orCode.trim();
    }

    public Integer getOrHospId() {
        return orHospId;
    }

    public void setOrHospId(Integer orHospId) {
        this.orHospId = orHospId;
    }

    public String getOrUserId() {
        return orUserId;
    }

    public void setOrUserId(String orUserId) {
        this.orUserId = orUserId == null ? null : orUserId.trim();
    }

    public String getOrBuynameId() {
        return orBuynameId;
    }

    public void setOrBuynameId(String orBuynameId) {
        this.orBuynameId = orBuynameId == null ? null : orBuynameId.trim();
    }

    public Date getOrCreatetime() {
        return orCreatetime;
    }

    public void setOrCreatetime(Date orCreatetime) {
        this.orCreatetime = orCreatetime;
    }

    public Date getOrUpdatetime() {
        return orUpdatetime;
    }

    public void setOrUpdatetime(Date orUpdatetime) {
        this.orUpdatetime = orUpdatetime;
    }

    public Date getOrSubmittime() {
        return orSubmittime;
    }

    public void setOrSubmittime(Date orSubmittime) {
        this.orSubmittime = orSubmittime;
    }

    public String getOrRemark() {
        return orRemark;
    }

    public void setOrRemark(String orRemark) {
        this.orRemark = orRemark == null ? null : orRemark.trim();
    }

    public Integer getOrType() {
        return orType;
    }

    public void setOrType(Integer orType) {
        this.orType = orType;
    }

    public Integer getOrAuditor() {
        return orAuditor;
    }

    public void setOrAuditor(Integer orAuditor) {
        this.orAuditor = orAuditor;
    }

    public String getOrAuditopinion() {
        return orAuditopinion;
    }

    public void setOrAuditopinion(String orAuditopinion) {
        this.orAuditopinion = orAuditopinion == null ? null : orAuditopinion.trim();
    }

    public Date getOrAuditTime() {
        return orAuditTime;
    }

    public void setOrAuditTime(Date orAuditTime) {
        this.orAuditTime = orAuditTime;
    }

    public Integer getOrState() {
        return orState;
    }

    public void setOrState(Integer orState) {
        this.orState = orState;
    }
}