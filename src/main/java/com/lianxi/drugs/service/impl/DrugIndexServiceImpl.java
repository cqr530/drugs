package com.lianxi.drugs.service.impl;

import com.lianxi.drugs.dao.DrugIndexMapper;
import com.lianxi.drugs.pojo.DrugDirectory;
import com.lianxi.drugs.service.DrugIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugIndexServiceImpl implements DrugIndexService {

    @Autowired
    private DrugIndexMapper drugIndexMapper;

    @Override
    public Integer insertDrugToHospital(List<DrugDirectory> list) {
        return drugIndexMapper.insertDrugToHospital(list);
    }

    @Override
    public Integer deleteDrugToHospital(int[] idArr) {
        return drugIndexMapper.deleteDrugToHospital(idArr);
    }
}
