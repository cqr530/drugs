package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.PayoffTab;
import com.lianxi.drugs.vo.PayoffTabVO;

import java.util.List;

public interface PayoffTabMapper {
    //查询所有结算单
    List<PayoffTabVO> selectAllPayoffTab();
}