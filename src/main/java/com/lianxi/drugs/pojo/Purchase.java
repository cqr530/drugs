package com.lianxi.drugs.pojo;

import java.util.Date;

public class Purchase {
    private Integer payoffTabId;

    private Integer payoffTabNum;

    private String payoffTabName;

    private Integer hospitalId;

    private String examine;

    private Integer examineEnd;

    private Date startTime;

    private Date endTime;

    private Date createTime;

    private Date inputTime;

    private Date examineTime;

    private Integer payoffTabStatus;

    private String hospitalName;

    public Integer getPayoffTabId() {
        return payoffTabId;
    }

    public void setPayoffTabId(Integer payoffTabId) {
        this.payoffTabId = payoffTabId;
    }

    public Integer getPayoffTabNum() {
        return payoffTabNum;
    }

    public void setPayoffTabNum(Integer payoffTabNum) {
        this.payoffTabNum = payoffTabNum;
    }

    public String getPayoffTabName() {
        return payoffTabName;
    }

    public void setPayoffTabName(String payoffTabName) {
        this.payoffTabName = payoffTabName == null ? null : payoffTabName.trim();
    }

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getExamine() {
        return examine;
    }

    public void setExamine(String examine) {
        this.examine = examine == null ? null : examine.trim();
    }

    public Integer getExamineEnd() {
        return examineEnd;
    }

    public void setExamineEnd(Integer examineEnd) {
        this.examineEnd = examineEnd;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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

    public Date getExamineTime() {
        return examineTime;
    }

    public void setExamineTime(Date examineTime) {
        this.examineTime = examineTime;
    }

    public Integer getPayoffTabStatus() {
        return payoffTabStatus;
    }

    public void setPayoffTabStatus(Integer payoffTabStatus) {
        this.payoffTabStatus = payoffTabStatus;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }
}