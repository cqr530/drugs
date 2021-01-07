package com.lianxi.drugs.dto;

import lombok.Data;

@Data
public class DrugIndexDto {

    /*药品信息id*/
    private Integer drugInfoId;

    /*登录用户id*/
    private Integer loginUserId;

    /*供货企业id*/
    private Integer companyId;

    /*药品储存量*/
    private Integer drugInventory;


}
