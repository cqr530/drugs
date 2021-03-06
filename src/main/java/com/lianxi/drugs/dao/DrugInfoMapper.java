package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.DrugInfo;
import com.lianxi.drugs.vo.DruginfoVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DrugInfoMapper {
    //查询所有药品信息
    List<DrugInfo> selectAllDrugInfo();
    //模糊查询
    List<DrugInfo> selectAllDrugInfoLike(@Param("druginfoVO") DruginfoVO druginfoVO);


}