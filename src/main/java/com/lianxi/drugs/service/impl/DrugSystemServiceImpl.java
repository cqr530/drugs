package com.lianxi.drugs.service.impl;

import com.lianxi.drugs.pojo.DrugClazz;
import com.lianxi.drugs.pojo.DrugInfo;
import com.lianxi.drugs.pojo.Item;
import com.lianxi.drugs.service.DrugSystemService;
import com.lianxi.drugs.vo.DruginfoVO;
import com.lianxi.drugs.vo.ItemVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugSystemServiceImpl implements DrugSystemService {
    @Autowired
    private com.lianxi.drugs.dao.UserMapper usermapper;

    @Autowired
    private com.lianxi.drugs.dao.DrugInfoMapper drugInfoMapper;

    @Autowired
    private com.lianxi.drugs.dao.ItemMapper itemMapper;

    @Autowired
    private com.lianxi.drugs.dao.DrugClazzMapper drugClazzMapper;

    @Override
    public int queryUser(String name, String pwd) {
        return usermapper.selectuser(name, pwd);
    }

    @Override
    public List<DrugInfo> queryDrug() {
        return drugInfoMapper.selectAllDrugInfo();
    }

    @Override
    public List<DrugClazz> queryDrugClazz() {
        return drugClazzMapper.selectDrugClazz();
    }

    @Override
    public List<DrugInfo> queryDrugLike(DruginfoVO druginfoVO) {
        return drugInfoMapper.selectAllDrugInfoLike(druginfoVO);
    }

    @Override
    public List<Item> queryItem() {
        return itemMapper.selectAllItem();
    }

    @Override
    public List<Item> queryItemLike(ItemVO itemVO) {
        return itemMapper.selectAllItemLike(itemVO);
    }
}
