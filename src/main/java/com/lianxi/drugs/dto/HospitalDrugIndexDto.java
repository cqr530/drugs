package com.lianxi.drugs.dto;

import com.lianxi.drugs.pojo.DrugPageBean;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class HospitalDrugIndexDto extends DrugPageBean {

    /*药品流水号*/
    private String serialNum;

    /*通用名*/
    private String genericName;

    /*剂型*/
    private String reagentType;

    /*规格*/
    private String drugSize;

    /*单位*/
    private Integer company;

    /*转换系数*/
    private Integer transverNum;

    /*生产企业*/
    private String factoryName;

    /*商品名*/
    private String productName;

    /*最大中标价*/
    private BigDecimal maxTenderPrice;
    /*最小中标价*/
    private BigDecimal minTenderPrice;

    /*药品类别*/
    private Integer drugClazzId;

    /*药品交易状态*/
    private Integer drugTranlStatus;

    /*医院id*/
    private Integer userCompany;
}
