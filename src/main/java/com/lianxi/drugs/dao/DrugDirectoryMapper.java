package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.DrugDirectory;

public interface DrugDirectoryMapper {
    int deleteByPrimaryKey(Integer hospitalId);

    int insert(DrugDirectory record);

    int insertSelective(DrugDirectory record);

    DrugDirectory selectByPrimaryKey(Integer hospitalId);

    int updateByPrimaryKeySelective(DrugDirectory record);

    int updateByPrimaryKey(DrugDirectory record);
}