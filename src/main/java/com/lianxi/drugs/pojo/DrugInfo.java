package com.lianxi.drugs.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class DrugInfo {
    private Integer drugId;

    private Integer serialNum;

    private String genericName;

    private String reagentType;

    private String drugSize;

    private String company;

    private Integer transverNum;

    private String factoryName;

    private String productName;

    private BigDecimal tenderPrice;

    private String approvalNum;

    private Date approvalNumDate;

    private Integer importProducStatus;

    private String packageMaterial;

    private String drugPackComp;

    private BigDecimal lrPrice;

    private Integer retailPriceFrom;

    private String qualityLevel;

    private String qualityLevelSpec;

    private Integer testReportStatus;

    private Integer drugReportId;

    private Date drugReportIdDate;

    private String drugSpecification;

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
        this.genericName = genericName == null ? null : genericName.trim();
    }

    public String getReagentType() {
        return reagentType;
    }

    public void setReagentType(String reagentType) {
        this.reagentType = reagentType == null ? null : reagentType.trim();
    }

    public String getDrugSize() {
        return drugSize;
    }

    public void setDrugSize(String drugSize) {
        this.drugSize = drugSize == null ? null : drugSize.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
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
        this.factoryName = factoryName == null ? null : factoryName.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public BigDecimal getTenderPrice() {
        return tenderPrice;
    }

    public void setTenderPrice(BigDecimal tenderPrice) {
        this.tenderPrice = tenderPrice;
    }

    public String getApprovalNum() {
        return approvalNum;
    }

    public void setApprovalNum(String approvalNum) {
        this.approvalNum = approvalNum == null ? null : approvalNum.trim();
    }

    public Date getApprovalNumDate() {
        return approvalNumDate;
    }

    public void setApprovalNumDate(Date approvalNumDate) {
        this.approvalNumDate = approvalNumDate;
    }

    public Integer getImportProducStatus() {
        return importProducStatus;
    }

    public void setImportProducStatus(Integer importProducStatus) {
        this.importProducStatus = importProducStatus;
    }

    public String getPackageMaterial() {
        return packageMaterial;
    }

    public void setPackageMaterial(String packageMaterial) {
        this.packageMaterial = packageMaterial == null ? null : packageMaterial.trim();
    }

    public String getDrugPackComp() {
        return drugPackComp;
    }

    public void setDrugPackComp(String drugPackComp) {
        this.drugPackComp = drugPackComp == null ? null : drugPackComp.trim();
    }

    public BigDecimal getLrPrice() {
        return lrPrice;
    }

    public void setLrPrice(BigDecimal lrPrice) {
        this.lrPrice = lrPrice;
    }

    public Integer getRetailPriceFrom() {
        return retailPriceFrom;
    }

    public void setRetailPriceFrom(Integer retailPriceFrom) {
        this.retailPriceFrom = retailPriceFrom;
    }

    public String getQualityLevel() {
        return qualityLevel;
    }

    public void setQualityLevel(String qualityLevel) {
        this.qualityLevel = qualityLevel == null ? null : qualityLevel.trim();
    }

    public String getQualityLevelSpec() {
        return qualityLevelSpec;
    }

    public void setQualityLevelSpec(String qualityLevelSpec) {
        this.qualityLevelSpec = qualityLevelSpec == null ? null : qualityLevelSpec.trim();
    }

    public Integer getTestReportStatus() {
        return testReportStatus;
    }

    public void setTestReportStatus(Integer testReportStatus) {
        this.testReportStatus = testReportStatus;
    }

    public Integer getDrugReportId() {
        return drugReportId;
    }

    public void setDrugReportId(Integer drugReportId) {
        this.drugReportId = drugReportId;
    }

    public Date getDrugReportIdDate() {
        return drugReportIdDate;
    }

    public void setDrugReportIdDate(Date drugReportIdDate) {
        this.drugReportIdDate = drugReportIdDate;
    }

    public String getDrugSpecification() {
        return drugSpecification;
    }

    public void setDrugSpecification(String drugSpecification) {
        this.drugSpecification = drugSpecification == null ? null : drugSpecification.trim();
    }

    public Integer getDrugTranlStatus() {
        return drugTranlStatus;
    }

    public void setDrugTranlStatus(Integer drugTranlStatus) {
        this.drugTranlStatus = drugTranlStatus;
    }
}