package com.lianxi.drugs.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DruginfoVO {

    private String drugId;

    /*药品流水号*/
    private String serialNum;

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

    /*商品名*/
    private String productName;

    /*中标价*/
    private BigDecimal tenderPrice;

    /*质量层次*/
    private String qualitylevel;

    /*药品类别*/
    private String drugClazzId;

    /*药品交易状态*/
    private Integer drugTranlStatus;

    /*最大中标价*/
    private BigDecimal max;
    /*最小中标价*/
    private BigDecimal min;
}
