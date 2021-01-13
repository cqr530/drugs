package com.lianxi.drugs.vo;

import lombok.Data;

import java.util.Date;
@Data
public class CreditOrderVO {
    private Integer Id;

    private Integer coId;

    private String coNumber;

    private String coName;

    private String hospitalName;

    private Date coCreatetime;

    private Date coInputtime;

    private String orCode;

    private String orBuynameId;

    private String genericName;

    private String productName;

    private String reagentType;

    private String drugSize;

    private String company;

    private Integer transverNum;

    private String qualityLevel;
}
