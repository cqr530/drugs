package com.lianxi.drugs.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CaiGouDrugVo {

    private Integer id;

    /*药品id*/
    private Integer drugId;
    /*流水号*/
    private Integer serialNum;
    /*通用名*/
    private String genericName;

    /*商品名*/
    private String productName;

    /*剂型*/
    private String reagentType;

    /*规格*/
    private String drugSize;

    /*单位*/
    private String company;

    /*转换系数*/
    private Integer transverNum;

   /*质量层次*/
    private String qualityLevel;

    /*生产企业*/
    private String factoryName;

    /*中标价*/
    private BigDecimal tenderPrice;

    /*交易价*/
    private BigDecimal orderTradingPrice;

    /*采购量*/
    private Integer orderBuyCount;

    /*采购总金额*/
    private BigDecimal orderBuyPrice;

    /*供货企业*/
    private Integer supplierId;

    /*采购状态*/
    private Integer payoffTabStatus;

}
