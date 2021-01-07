package com.lianxi.drugs.service.impl;

import com.lianxi.drugs.dao.DrugIndexMapper;
import com.lianxi.drugs.pojo.User;
import com.lianxi.drugs.service.DrugIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugIndexServiceImpl implements DrugIndexService {

    @Autowired
    private DrugIndexMapper drugIndexMapper;

    @Override
    public Integer insertDrugToHospital(Integer userId, int[] idArr) {
        return drugIndexMapper.insertDrugToHospital(userId,idArr);
    }
}
