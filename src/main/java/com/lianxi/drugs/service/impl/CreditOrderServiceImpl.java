package com.lianxi.drugs.service.impl;

import com.lianxi.drugs.dao.CreditOrderMapper;
import com.lianxi.drugs.dto.TuiHuoDanDto;
import com.lianxi.drugs.service.CreditOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditOrderServiceImpl implements CreditOrderService {

    @Autowired
    private CreditOrderMapper creditOrderMapper;

    @Override
    public Integer insertTuiHuoDanDto(TuiHuoDanDto tuiHuoDanDto) {
        return creditOrderMapper.insertTuiHuoDanDto(tuiHuoDanDto);
    }
}
