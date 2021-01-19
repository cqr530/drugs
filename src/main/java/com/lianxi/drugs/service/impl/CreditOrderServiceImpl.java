package com.lianxi.drugs.service.impl;

import com.lianxi.drugs.dao.CreditOrderInfoMapper;
import com.lianxi.drugs.dao.CreditOrderMapper;
import com.lianxi.drugs.dto.TuiHuoDanDto;
import com.lianxi.drugs.pojo.CreditOrderInfo;
import com.lianxi.drugs.service.CreditOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditOrderServiceImpl implements CreditOrderService {

    @Autowired
    private CreditOrderMapper creditOrderMapper;

    @Autowired
    private CreditOrderInfoMapper creditOrderInfoMapper;

    @Override
    public Integer insertTuiHuoDanDto(TuiHuoDanDto tuiHuoDanDto) {
        return creditOrderMapper.insertTuiHuoDanDto(tuiHuoDanDto);
    }

    @Override
    public Integer todeleteTuiHuoDan(Integer id) {

        return creditOrderMapper.todeleteTuiHuoDan(id);
    }

    @Override
    public Integer addDrugToTuiHuoDan(List<CreditOrderInfo> list) {
        return creditOrderInfoMapper.addDrugToTuiHuoDan(list);
    }
}
