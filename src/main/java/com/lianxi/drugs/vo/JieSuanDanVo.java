package com.lianxi.drugs.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class JieSuanDanVo {
    /*id*/
    private Integer id;

    /*编号*/
    private Integer payoffTabNum;

    /*名字*/
    private String payoffTabName;

    /*联系人*/
    private String contacts;

    /*联系电话*/
    private String contactsPhone;

    /*创建时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    /*提交时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date inputTime;

    /*备注*/
    private String payoffTabPostil;

    /*状态*/
    private String payoffTabStatus;

    /*总金额*/
    private String payoffPrice;
}
