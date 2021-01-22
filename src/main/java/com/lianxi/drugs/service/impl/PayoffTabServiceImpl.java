package com.lianxi.drugs.service.impl;

import com.lianxi.drugs.dao.PayoffTabMapper;
import com.lianxi.drugs.dto.JieSuanDanDto;
import com.lianxi.drugs.pojo.DataTableResult;
import com.lianxi.drugs.pojo.PayoffTab;
import com.lianxi.drugs.service.PayoffTabService;
import com.lianxi.drugs.vo.JieSuanDanVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayoffTabServiceImpl implements PayoffTabService {

    @Autowired
    private PayoffTabMapper payoffTabMapper;

    @Override
    public Integer createJieSuanDan(PayoffTab payoffTab) {
        return payoffTabMapper.createJieSuanDan(payoffTab);
    }

    @Override
    public DataTableResult queryAllJieSuanDanPage(JieSuanDanDto jieSuanDanDto) {
        List<JieSuanDanVo> jieSuanDanVoList = payoffTabMapper.queryAllJieSuanDanPage(jieSuanDanDto);
        long count = payoffTabMapper.queryAllJieSuanDanCount(jieSuanDanDto);
        DataTableResult dataTableResult = new DataTableResult(jieSuanDanDto.getDraw(),count,count,jieSuanDanVoList);
        return dataTableResult;
    }

    @Override
    public JieSuanDanVo queryJieSuanDanById(Integer id) {
        return payoffTabMapper.queryJieSuanDanById(id);
    }
}
