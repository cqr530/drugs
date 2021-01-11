package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.supplierDrugMenu;
import org.apache.ibatis.annotations.Param;

public interface supplierDrugMenuMapper {
    //选择供货
    Integer insertDrugs(@Param("list") Integer[] list);
    //取消供货
    Integer deleteDrugs(@Param("list") Integer[] list);
}