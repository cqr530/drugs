package com.lianxi.drugs.dao;

import com.lianxi.drugs.dto.JieSuanDanDto;
import com.lianxi.drugs.dto.JieSuanDanInfoDto;
import com.lianxi.drugs.pojo.PayoffTabInfo;
import com.lianxi.drugs.vo.JieSuanDanInfoVo;

import java.util.List;

public interface PayoffTabInfoMapper {
    int insert(PayoffTabInfo record);

    int insertSelective(PayoffTabInfo record);

    List<JieSuanDanInfoVo> queryAllJieSuanDanAndDrugPage(JieSuanDanInfoDto jieSuanDanInfoDto);

    long queryAllJiceSuanDanAndDrugCount(JieSuanDanInfoDto jieSuanDanInfoDto);

    List<JieSuanDanInfoVo> queryJieSuanDanAndDrugPageByJieSuanDanId(JieSuanDanDto jieSuanDanDto);

    long queryJiceSuanDanAndDrugCountByJieSuanDanId(JieSuanDanDto jieSuanDanDto);
}