package com.lianxi.drugs.service.impl;

import com.lianxi.drugs.pojo.DrugInfo;
import com.lianxi.drugs.service.DrugSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugSystemServiceImpl implements DrugSystemService {
    @Autowired
    private com.lianxi.drugs.dao.UserMapper usermapper;

    @Autowired
    private com.lianxi.drugs.dao.DrugInfoMapper drugInfoMapper;

    @Override
    public int queryUser(String name, String pwd) {
        return usermapper.selectuser(name, pwd);
    }

    @Override
    public List<DrugInfo> queryDrug() {
        return drugInfoMapper.selectAllDrugInfo();
    }
}
