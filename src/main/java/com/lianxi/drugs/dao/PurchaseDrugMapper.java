package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.DrugInfo;
import com.lianxi.drugs.pojo.PurchaseDrug;

import java.util.List;

public interface PurchaseDrugMapper {

    Integer addDrugToCaiGouDan(List<PurchaseDrug> list);

    List<DrugInfo> queryPurchaseDrugById(Integer id);










    int deleteByPrimaryKey(Integer orderNum);

    int insert(PurchaseDrug record);

    int insertSelective(PurchaseDrug record);

    PurchaseDrug selectByPrimaryKey(Integer orderNum);

    int updateByPrimaryKeySelective(PurchaseDrug record);

    int updateByPrimaryKey(PurchaseDrug record);


}