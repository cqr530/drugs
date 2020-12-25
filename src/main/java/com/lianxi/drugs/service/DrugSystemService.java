package com.lianxi.drugs.service;

import com.lianxi.drugs.pojo.DrugInfo;

import java.util.List;

public interface DrugSystemService {
    int queryUser (String name,String pwd);

    List<DrugInfo> queryDrug();
}
