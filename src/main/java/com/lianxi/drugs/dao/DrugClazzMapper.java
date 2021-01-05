package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.DrugClazz;

import java.util.List;

public interface DrugClazzMapper {
    //查询所有质量层次
    List<DrugClazz> selectDrugClazz();
}