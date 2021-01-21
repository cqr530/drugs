package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.CreditOrderInfo;

import java.util.List;

public interface CreditOrderInfoMapper {

    Integer addDrugToTuiHuoDan(List<CreditOrderInfo> list);
}