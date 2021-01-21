package com.lianxi.drugs.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
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

    private String drugTranlStatus;

    private String drugType;

    private Integer drugExamineStatus;

    private Integer companyId;
}