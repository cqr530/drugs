package com.lianxi.drugs.vo;

import lombok.Data;

import java.util.Date;
@Data
public class OrderVO {

    private Integer orId;

    private String orCode;

    private String orBuynameId;

    private Integer orHospId;

    private Date orCreatetime;

    private Date orSubmittime;

    private String genericName;

    private String productName;

    private String reagentType;

    private String drugSize;

    private String company;

    private Integer transverNum;

    private Float orderBiddingprice;

    private Float orderTradingprice;

    private Integer orderBuycount;

    private Float orderBuyprice;

    private Integer orderBuystate;

    private String factoryName;
}
