package com.lianxi.drugs.dto;

import com.lianxi.drugs.pojo.DrugPageBean;

public class QueryDrugItemDto extends DrugPageBean {

    private String drugCategoryId;

    private String drugCategoryName;

    private String drugCategoryType;

    private String drugCategoryStandard;

    private String drugCategoryUnit;

    private Integer drugCategoryTran;

    private Integer drugClazzId;

    private Integer drugCategoryStatus;

    public String getDrugCategoryId() {
        return drugCategoryId;
    }

    public void setDrugCategoryId(String drugCategoryId) {
        this.drugCategoryId = drugCategoryId;
    }

    public String getDrugCategoryName() {
        return drugCategoryName;
    }

    public void setDrugCategoryName(String drugCategoryName) {
        this.drugCategoryName = drugCategoryName;
    }

    public String getDrugCategoryType() {
        return drugCategoryType;
    }

    public void setDrugCategoryType(String drugCategoryType) {
        this.drugCategoryType = drugCategoryType;
    }

    public String getDrugCategoryStandard() {
        return drugCategoryStandard;
    }

    public void setDrugCategoryStandard(String drugCategoryStandard) {
        this.drugCategoryStandard = drugCategoryStandard;
    }

    public String getDrugCategoryUnit() {
        return drugCategoryUnit;
    }

    public void setDrugCategoryUnit(String drugCategoryUnit) {
        this.drugCategoryUnit = drugCategoryUnit;
    }

    public Integer getDrugCategoryTran() {
        return drugCategoryTran;
    }

    public void setDrugCategoryTran(Integer drugCategoryTran) {
        this.drugCategoryTran = drugCategoryTran;
    }

    public Integer getDrugClazzId() {
        return drugClazzId;
    }

    public void setDrugClazzId(Integer drugClazzId) {
        this.drugClazzId = drugClazzId;
    }

    public Integer getDrugCategoryStatus() {
        return drugCategoryStatus;
    }

    public void setDrugCategoryStatus(Integer drugCategoryStatus) {
        this.drugCategoryStatus = drugCategoryStatus;
    }
}
