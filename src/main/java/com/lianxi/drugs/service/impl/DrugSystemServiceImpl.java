package com.lianxi.drugs.service.impl;

import com.lianxi.drugs.pojo.DrugClazz;
import com.lianxi.drugs.pojo.DrugInfo;
import com.lianxi.drugs.pojo.Item;
import com.lianxi.drugs.pojo.OrderForm;
import com.lianxi.drugs.service.DrugSystemService;
import com.lianxi.drugs.vo.DruginfoVO;
import com.lianxi.drugs.vo.ItemVO;
import com.lianxi.drugs.vo.OrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DrugSystemServiceImpl implements DrugSystemService {
    @Autowired
    private com.lianxi.drugs.dao.UserMapper usermapper;

    @Autowired
    private com.lianxi.drugs.dao.DrugInfoMapper drugInfoMapper;

    @Autowired
    private com.lianxi.drugs.dao.ItemMapper itemMapper;

    @Autowired
    private com.lianxi.drugs.dao.DrugClazzMapper drugClazzMapper;

    @Autowired
    private com.lianxi.drugs.dao.OrderFormMapper orderFormMapper;

    @Override
    public Integer queryUser(String name, String pwd) {
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

    @Override
    public List<OrderVO> queryAllOrder() {
        return orderFormMapper.selectAllOrder();
    }
}
