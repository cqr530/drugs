package com.lianxi.drugs.service.impl;

import com.lianxi.drugs.dao.PayoffTabInfoMapper;
import com.lianxi.drugs.dto.JieSuanDanInfoDto;
import com.lianxi.drugs.pojo.DataTableResult;
import com.lianxi.drugs.service.PayoffTabInfoService;
import com.lianxi.drugs.vo.JieSuanDanInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayoffTabInfoServiceImpl implements PayoffTabInfoService {

    @Autowired
    private PayoffTabInfoMapper payoffTabInfoMapper;

    @Override
    public DataTableResult queryAllJieSuanDanAndDrugPage(JieSuanDanInfoDto jieSuanDanInfoDto) {
        List<JieSuanDanInfoVo> jieSuanDanInfoVoList = payoffTabInfoMapper.queryAllJieSuanDanAndDrugPage(jieSuanDanInfoDto);
        long count = payoffTabInfoMapper.queryAllJiceSuanDanAndDrugCount(jieSuanDanInfoDto);
        DataTableResult dataTableResult = new DataTableResult(jieSuanDanInfoDto.getDraw(),count,count,jieSuanDanInfoVoList);
        return dataTableResult;
    }
}
