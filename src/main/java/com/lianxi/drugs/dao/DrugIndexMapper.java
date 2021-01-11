package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.DrugDirectory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DrugIndexMapper {
    Integer insertDrugToHospital(@Param("list") List<DrugDirectory> list);

    Integer deleteDrugToHospital(int[] idArr);
}
