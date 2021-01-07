package com.lianxi.drugs.dao;

import org.apache.ibatis.annotations.Param;

public interface DrugIndexMapper {
    Integer insertDrugToHospital(@Param("userId") Integer userId, @Param("idArr")int[] idArr);
}
