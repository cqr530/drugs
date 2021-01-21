package com.lianxi.drugs.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lianxi.drugs.pojo.DrugPageBean;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class TuiHuoDanDto extends DrugPageBean {
    private Integer hospitalNum;

    private Integer creditNum;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date creditCreateTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date creditInputTime;

    private String creditContacts;

    private Integer creditState;

    private String creditRemark;

    private String creditName;

    private String phone;

    private String createPeople;
}
