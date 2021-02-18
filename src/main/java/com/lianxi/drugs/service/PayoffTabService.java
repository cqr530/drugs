package com.lianxi.drugs.service;

import com.lianxi.drugs.dto.JieSuanDanDto;
import com.lianxi.drugs.pojo.DataTableResult;
import com.lianxi.drugs.pojo.PayoffTab;
import com.lianxi.drugs.pojo.PayoffTabInfo;
import com.lianxi.drugs.vo.JieSuanDanVo;

import java.util.List;

public interface PayoffTabService {
    Integer createJieSuanDan(PayoffTab payoffTab);

    DataTableResult queryAllJieSuanDanPage(JieSuanDanDto jieSuanDanDto);

    JieSuanDanVo queryJieSuanDanById(Integer id);

    Integer addDrugToJieSuanDanInfo(List<PayoffTabInfo> list);
}
