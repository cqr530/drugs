package com.lianxi.drugs.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class CaiGouDrugVo {
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

    private Integer hospitalId;
    private String hospitalName;
    private Integer payofftabNum;
    private String payoffTabName;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date inputTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date examineTime;

    private Integer examine;

}
