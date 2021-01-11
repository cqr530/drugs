package com.lianxi.drugs.vo;

import lombok.Data;

@Data
public class HospitalVo {

    /*id*/
    private Integer id;

    /*医院名字*/
    private String hospitalName;

    /*医院所属地区*/
    private String hosptalArea;

    /*医院级别*/
    private String hospitalLevl;

    /*医院类型*/
    private String hospitalType;
}
