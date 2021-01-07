package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.AreaSupplier;

public interface AreaSupplierMapper {
    int deleteByPrimaryKey(Integer companyId);

    int insert(AreaSupplier record);

    int insertSelective(AreaSupplier record);

    AreaSupplier selectByPrimaryKey(Integer companyId);

    int updateByPrimaryKeySelective(AreaSupplier record);

    int updateByPrimaryKey(AreaSupplier record);
}