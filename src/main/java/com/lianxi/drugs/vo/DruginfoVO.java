package com.lianxi.drugs.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DruginfoVO {
    private String drugId;

    private String serialNum;

    private String genericName;

    private String reagentType;

    private String drugSize;

    private String company;

    private Integer transverNum;

    private String factoryName;

    private String productName;

    private BigDecimal tenderPrice;

    private String qualityLevel;

    private String drugClazzName;

    private Integer drugTranlStatus;

    public String getDrugId() {
        return drugId;
    }

    public void setDrugId(String drugId) {
        this.drugId = drugId;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public String getReagentType() {
        return reagentType;
    }

    public void setReagentType(String reagentType) {
        this.reagentType = reagentType;
    }

    public String getDrugSize() {
        return drugSize;
    }

    public void setDrugSize(String drugSize) {
        this.drugSize = drugSize;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getTransverNum() {
        return transverNum;
    }

    public void setTransverNum(Integer transverNum) {
        this.transverNum = transverNum;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getTenderPrice() {
        return tenderPrice;
    }

    public void setTenderPrice(BigDecimal tenderPrice) {
        this.tenderPrice = tenderPrice;
    }

    public String getQualityLevel() {
        return qualityLevel;
    }

    public void setQualityLevel(String qualityLevel) {
        this.qualityLevel = qualityLevel;
    }

    public String getDrugClazzName() {
        return drugClazzName;
    }

    public void setDrugClazzName(String drugClazzName) {
        this.drugClazzName = drugClazzName;
    }

    public Integer getDrugTranlStatus() {
        return drugTranlStatus;
    }

    public void setDrugTranlStatus(Integer drugTranlStatus) {
        this.drugTranlStatus = drugTranlStatus;
    }
}
