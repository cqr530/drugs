package com.lianxi.drugs.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lianxi.drugs.pojo.DrugPageBean;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class CaiGouDanDto extends DrugPageBean {

    /*采购单编号*/
    private Integer payoffTabNum;

    /*采购单名称*/
    private String payoffTabName;

    /*采购单状态*/
    private Integer payoffTabStatus;

    /*采购时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date minStartTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date maxStartTime;

    /*开始时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date startTime;

    /*结束时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date endTime;

    /*建单时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    /*提交时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date inputTime;

    /*审核时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date examineTime;


    /*审核意见*/
    private String examine;

    /*审核结果*/
    private Integer examineEnd;

    /*医院id*/
    private Integer hospitalId;

    /*医院name*/
    private String hospitalName;


}
