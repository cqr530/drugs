package com.lianxi.drugs.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class JieSuanDanInfoVo {
    /*id*/
    private Integer id;

    /*编号*/
    private Integer payoffTabNum;

    /*名字*/
    private String payoffTabName;

    /*医院名字*/
    private String hospitalName;

    /*流水号*/
    private Integer serialNum;

    /*通用名*/
    private String genericName;

    /*中标价*/
    private BigDecimal tenderPrice;

    /*交易价*/
    private BigDecimal orderTradingPrice;

    /*采购量*/
    private Integer orderBuyCount;

    /*采购金额*/
    private BigDecimal orderBuyPrice;

    /*药品批号*/
    private BigDecimal approvalNum;

    /*药品有效期*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date approvalNumDate;

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
    private String companyName;

    /*创建时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date startTime;

    /*提交时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date endTime;

    /*采购状态*/
    private String drugTranlStatus;


    private String userCompany;

}
