package com.lianxi.drugs.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class CaiGouDanAndDrugVo {

    /*ID*/
    private Integer id;

    /*订单编号*/
    private Integer payofftabNum;

    /*订单名称*/
    private String payoffTabName;

    /*采购医院*/
    private String hospitalName;

    /*流水号*/
    private Integer serialNum;

    /*通用名*/
    private String genericName;

    /*商品名*/
    private String productName;

    /*中标价*/
    private BigDecimal tenderPrice;

    /*交易价*/
    private BigDecimal orderTradingPrice;

    /*采购量*/
    private Integer orderBuyCount;

    /*采购金额*/
    private BigDecimal orderBuyPrice;

    /*入库量*/
    /*实际交易金额*/
    /*发票号或入库单号*/

    /*药品批号*/
    private String approvalNum;

    /*药品有效期*/

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

    /*供货企业*/
    private Integer supplierId;

    /*开始采购时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date startTime;

    /*结束采购时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date endTime;

    /*采购状态*/
    private Integer drugTranlStatus;
}
