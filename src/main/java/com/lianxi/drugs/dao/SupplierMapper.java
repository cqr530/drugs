package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.Supplier;

public interface SupplierMapper {
    int deleteByPrimaryKey(Integer companyId);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(Integer companyId);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}