package com.lianxi.drugs.vo;

import lombok.Data;

import java.util.Date;
@Data
public class PayoffTabVO {
    private Integer Id;//序号

    private String payoffTabNum;//结算单号

    private String payoffTabName;//结算单名称

    private String hospitalName;//下单医院

    private Date createTime;//开始采购时间

    private Date inputTime;//结束采购时间

    private String orCode;//对应采购单编号

    private String orBuynameId;//采购单名称

    private String genericName;//通用名

    private String productName;//商品名

    private String reagentType;//剂型

    private String drugSize;//规格

    private String company;//单位

    private Integer transverNum;//转换系数

    private String qualityLevel;//质量层次

    private String factoryName;//生产企业

    private Float orderBiddingprice;//中标价

    private Float orderTradingprice;//交易价

    private Integer orderBuycount;//采购量

    private Float orderBuyprice;//采购金额
}
