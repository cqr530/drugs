package com.lianxi.drugs.service.impl;

import com.lianxi.drugs.service.DrugSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrugSystemServiceImpl implements DrugSystemService {
    @Autowired
    private com.lianxi.drugs.dao.UserMapper usermapper;


    @Override
    public int queryuser(Integer id, String pwd) {
        return usermapper.selectuser(id, pwd);
    }
}
