package com.lianxi.drugs.service;

import com.lianxi.drugs.dto.JieSuanDanDto;
import com.lianxi.drugs.pojo.DataTableResult;
import com.lianxi.drugs.pojo.PayoffTab;
import com.lianxi.drugs.vo.JieSuanDanVo;

public interface PayoffTabService {
    Integer createJieSuanDan(PayoffTab payoffTab);

    DataTableResult queryAllJieSuanDanPage(JieSuanDanDto jieSuanDanDto);

    JieSuanDanVo queryJieSuanDanById(Integer id);
}
