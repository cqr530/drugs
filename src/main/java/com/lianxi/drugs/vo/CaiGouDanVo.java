package com.lianxi.drugs.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class CaiGouDanVo {
    /*id*/
    private Integer id;

    /*医院编号*/
    private String hospitalId;

    /*医院名称*/
    private String hospitalName;

    private String examine;

    /*采购单编号*/
    private String payoffTabNum;

    /*采购单名称*/
    private String payoffTabName;

    /*开始时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date startTime;

    /*结束时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date endTime;

    /*创建时间*/
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

    /*采购单状态*/
    private String payoffTabStatus;


}
