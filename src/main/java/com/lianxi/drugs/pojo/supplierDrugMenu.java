package com.lianxi.drugs.pojo;

public class supplierDrugMenu {
    private Integer id;

    private String companyId;

    private String drugId;

    private String origanzitionControlStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getDrugId() {
        return drugId;
    }

    public void setDrugId(String drugId) {
        this.drugId = drugId == null ? null : drugId.trim();
    }

    public String getOriganzitionControlStatus() {
        return origanzitionControlStatus;
    }

    public void setOriganzitionControlStatus(String origanzitionControlStatus) {
        this.origanzitionControlStatus = origanzitionControlStatus == null ? null : origanzitionControlStatus.trim();
    }
}