package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.DrugClazz;

import java.util.List;

public interface DrugClazzMapper {
    //查询所有药品类别
    List<DrugClazz> selectDrugClazz();































    int deleteByPrimaryKey(Integer drugClazzId);

    int insert(DrugClazz record);

    int insertSelective(DrugClazz record);

    DrugClazz selectByPrimaryKey(Integer drugClazzId);

    int updateByPrimaryKeySelective(DrugClazz record);

    int updateByPrimaryKey(DrugClazz record);
}