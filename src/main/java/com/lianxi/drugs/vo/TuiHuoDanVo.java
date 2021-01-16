package com.lianxi.drugs.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class TuiHuoDanVo{
    /*id*/
    private Integer id;
    /*退货单编号*/
    private Integer creditNum;
    /*退货单名称*/
    private String creditName;
    /*医院名称*/
    private String hospitalName;
    /*联系人*/
    private String creditContacts;
    /*联系电话*/
    private String phone;
    /*建单人*/
    private String createPeople;
    /*建单时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone="GMT+8")
    private Date creditCreateTime;
    /*提交时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone="GMT+8")
    private Date creditInputTime;
    /*备注*/
    private String creditRemark;
    /*退货单状态*/
    private Integer creditState;
}
