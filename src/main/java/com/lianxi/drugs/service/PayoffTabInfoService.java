package com.lianxi.drugs.service;

import com.lianxi.drugs.dto.JieSuanDanDto;
import com.lianxi.drugs.dto.JieSuanDanInfoDto;
import com.lianxi.drugs.pojo.DataTableResult;

public interface PayoffTabInfoService {

    DataTableResult queryAllJieSuanDanAndDrugPage(JieSuanDanInfoDto jieSuanDanInfoDto);

    DataTableResult selectDrugInfoByJieSuanDanId(JieSuanDanDto jieSuanDanDto);
}
