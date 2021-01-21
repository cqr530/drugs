package com.lianxi.drugs.service.impl;

import com.lianxi.drugs.dao.PayoffTabMapper;
import com.lianxi.drugs.pojo.PayoffTab;
import com.lianxi.drugs.service.PayoffTabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayoffTabServiceImpl implements PayoffTabService {

    @Autowired
    private PayoffTabMapper payoffTabMapper;

    @Override
    public Integer createJieSuanDan(PayoffTab payoffTab) {
        return payoffTabMapper.createJieSuanDan(payoffTab);
    }
}
