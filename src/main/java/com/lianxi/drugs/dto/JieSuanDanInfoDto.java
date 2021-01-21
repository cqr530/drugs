package com.lianxi.drugs.dto;

import com.lianxi.drugs.pojo.DrugPageBean;
import lombok.Data;

@Data
public class JieSuanDanInfoDto extends DrugPageBean {
    /*登录用户所在单位*/
    private Integer userCompany;
}
