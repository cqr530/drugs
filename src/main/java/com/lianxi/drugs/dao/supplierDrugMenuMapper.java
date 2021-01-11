package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.supplierDrugMenu;
import org.apache.ibatis.annotations.Param;

public interface supplierDrugMenuMapper {
    //选择供货
    Integer addDrugs(@Param("list") Integer[] list);

}