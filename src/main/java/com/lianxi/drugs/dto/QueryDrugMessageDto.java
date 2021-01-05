package com.lianxi.drugs.dto;

import com.lianxi.drugs.pojo.DrugPageBean;

import java.math.BigDecimal;

/*药品信息*/
public class QueryDrugMessageDto extends DrugPageBean {

    private Integer drugId;

    /*药品流水号*/
    private Integer serialNum;

    /*通用名*/
    private String genericName;

    /*剂型*/
    private String reagentType;

    /*规格*/
    private String drugSize;

    /*单位*/
    private String company;

    /*转换系数*/
    private Integer transverNum;

    /*生产企业*/
    private String factoryName;

    /*商品名称*/
    private String productName;

    /*最大中标价*/
    private BigDecimal maxTenderPrice;
    /*最小中标价*/
    private BigDecimal minTenderPrice;

    /*质量层次*/
    private String qualityLevel;

    /*药品类别*/
    private Integer drugClazzId;

    /*药品交易状态*/
    private Integer drugTranlStatus;



    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public Integer getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(Integer serialNum) {
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

    public BigDecimal getMaxTenderPrice() {
        return maxTenderPrice;
    }

    public void setMaxTenderPrice(BigDecimal maxTenderPrice) {
        this.maxTenderPrice = maxTenderPrice;
    }

    public BigDecimal getMinTenderPrice() {
        return minTenderPrice;
    }

    public void setMinTenderPrice(BigDecimal minTenderPrice) {
        this.minTenderPrice = minTenderPrice;
    }

    public String getQualityLevel() {
        return qualityLevel;
    }

    public void setQualityLevel(String qualityLevel) {
        this.qualityLevel = qualityLevel;
    }

    public Integer getDrugClazzId() {
        return drugClazzId;
    }

    public void setDrugClazzId(Integer drugClazzId) {
        this.drugClazzId = drugClazzId;
    }

    public Integer getDrugTranlStatus() {
        return drugTranlStatus;
    }

    public void setDrugTranlStatus(Integer drugTranlStatus) {
        this.drugTranlStatus = drugTranlStatus;
    }
}
