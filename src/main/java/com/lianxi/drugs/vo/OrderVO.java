package com.lianxi.drugs.vo;

import lombok.Data;

import java.util.Date;
@Data
public class OrderVO {
    //序号
    private Integer orId;
    //采购单号
    private String orCode;
    //采购单名
    private String orBuynameId;
    //采购医院
    private Integer orHospId;
    //开始采购时间
    private Date orCreatetime;
    //结束采购时间
    private Date orSubmittime;
    //通用名
    private String genericName;
    //商品名
    private String productName;
    //剂型
    private String reagentType;
    //规格
    private String drugSize;
    //单位
    private String company;
    //转换系数
    private Integer transverNum;
    //中标价
    private Float orderBiddingprice;
    //交易价
    private Float orderTradingprice;
    //采购量
    private Integer orderBuycount;
    //采购金额
    private Float orderBuyprice;
    //生产企业
    private String factoryName;
    //供货企业
    private Integer supplierId;
    //采购状态
    private Integer orderBuystate;

}
