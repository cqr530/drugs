package com.lianxi.drugs.pojo;

public class DrugtranlStatus {
    private Integer id;

    private String drugTranlStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDrugTranlStatus() {
        return drugTranlStatus;
    }

    public void setDrugTranlStatus(String drugTranlStatus) {
        this.drugTranlStatus = drugTranlStatus == null ? null : drugTranlStatus.trim();
    }
}