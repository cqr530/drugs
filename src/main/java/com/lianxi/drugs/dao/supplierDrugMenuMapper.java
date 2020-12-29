package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.supplierDrugMenu;

public interface supplierDrugMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(supplierDrugMenu record);

    int insertSelective(supplierDrugMenu record);

    supplierDrugMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(supplierDrugMenu record);

    int updateByPrimaryKey(supplierDrugMenu record);
}