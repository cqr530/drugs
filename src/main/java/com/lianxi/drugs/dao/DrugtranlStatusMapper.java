package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.DrugtranlStatus;

import java.util.List;

public interface DrugtranlStatusMapper {
    //查询所有交易状态
    List<DrugtranlStatus> selectAllDrugtranlStatus();
}