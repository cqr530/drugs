package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.DrugInfo;

import java.util.List;

public interface DrugInfoMapper {

    List<DrugInfo> selectAllDrugInfo();




















    int deleteByPrimaryKey(Integer drugId);

    int insert(DrugInfo record);

    int insertSelective(DrugInfo record);

    DrugInfo selectByPrimaryKey(Integer drugId);

    int updateByPrimaryKeySelective(DrugInfo record);

    int updateByPrimaryKey(DrugInfo record);
}