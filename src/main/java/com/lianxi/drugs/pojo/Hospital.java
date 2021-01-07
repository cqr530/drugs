package com.lianxi.drugs.pojo;

public class Hospital {
    private Integer hospitalId;

    private String hospitalName;

    private String hosptalArea;

    private String hospitalLevl;

    private String hospitalType;

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    public String getHosptalArea() {
        return hosptalArea;
    }

    public void setHosptalArea(String hosptalArea) {
        this.hosptalArea = hosptalArea == null ? null : hosptalArea.trim();
    }

    public String getHospitalLevl() {
        return hospitalLevl;
    }

    public void setHospitalLevl(String hospitalLevl) {
        this.hospitalLevl = hospitalLevl == null ? null : hospitalLevl.trim();
    }

    public String getHospitalType() {
        return hospitalType;
    }

    public void setHospitalType(String hospitalType) {
        this.hospitalType = hospitalType == null ? null : hospitalType.trim();
    }
}