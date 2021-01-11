package com.lianxi.drugs.pojo;

import lombok.Data;

@Data
public class DrugDirectory {
    private Integer id;

    private Integer hospitalId;

    private Integer drugId;

    private Integer companyId;

    private Integer drugInventory;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getDrugInventory() {
        return drugInventory;
    }

    public void setDrugInventory(Integer drugInventory) {
        this.drugInventory = drugInventory;
    }
}