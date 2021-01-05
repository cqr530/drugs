package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.PurchaseDrug;

public interface PurchaseDrugMapper {
    int deleteByPrimaryKey(Integer orderNum);

    int insert(PurchaseDrug record);

    int insertSelective(PurchaseDrug record);

    PurchaseDrug selectByPrimaryKey(Integer orderNum);

    int updateByPrimaryKeySelective(PurchaseDrug record);

    int updateByPrimaryKey(PurchaseDrug record);
}