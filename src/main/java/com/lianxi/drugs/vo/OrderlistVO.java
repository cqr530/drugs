package com.lianxi.drugs.vo;

import lombok.Data;

import java.util.Date;

@Data
public class OrderlistVO {

    private Integer orderId;

    private Integer orHospId;

    private Integer supplierId;

    private String orCode;

    private String orBuynameId;

    private Integer orderBuystate;

    private Date createTime;

    private Date inputTime;

    private Date orCreatetime;

    private Date orSubmittime;

    private Date orAuditTime;

    private Float orderBuyprice;

}
