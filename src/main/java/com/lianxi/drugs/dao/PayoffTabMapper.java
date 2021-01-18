package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.PayoffTab;
import com.lianxi.drugs.vo.PayoffTabVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PayoffTabMapper {
    //查询所有结算单
    List<PayoffTabVO> selectAllPayoffTab();
    //结算
    Integer updatePayoffTab(@Param("list") Integer[] list);
}