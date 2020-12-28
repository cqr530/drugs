package com.lianxi.drugs.pojo;

public class DrugClazz {
    private Integer drugClazzId;

    private String drugClazzName;

    private Integer drugClazzStatus;

    public Integer getDrugClazzId() {
        return drugClazzId;
    }

    public void setDrugClazzId(Integer drugClazzId) {
        this.drugClazzId = drugClazzId;
    }

    public String getDrugClazzName() {
        return drugClazzName;
    }

    public void setDrugClazzName(String drugClazzName) {
        this.drugClazzName = drugClazzName == null ? null : drugClazzName.trim();
    }

    public Integer getDrugClazzStatus() {
        return drugClazzStatus;
    }

    public void setDrugClazzStatus(Integer drugClazzStatus) {
        this.drugClazzStatus = drugClazzStatus;
    }
}