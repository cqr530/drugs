package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.QualityLevel;

import java.util.List;

public interface QualityLevelMapper {
    //查询所有质量层次
    List<QualityLevel>  selectAllQualityLevel();
}