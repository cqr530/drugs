package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.DrugInfo;
import com.lianxi.drugs.pojo.supplierDrugMenu;
import com.lianxi.drugs.vo.DruginfoVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface supplierDrugMenuMapper {
    //选择供货
    Integer insertDrugs(@Param("list") Integer[] list);
    //取消供货
    Integer deleteDrugs(@Param("list") Integer[] list);
    //供货维护模糊查询
    List<DrugInfo> selectAllDrugsLike(@Param("druginfoVO") DruginfoVO druginfoVO);
}