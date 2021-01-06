package com.lianxi.drugs.service.impl;

import com.lianxi.drugs.dao.CreditOrderMapper;
import com.lianxi.drugs.pojo.DrugClazz;
import com.lianxi.drugs.pojo.DrugInfo;
import com.lianxi.drugs.pojo.Item;
import com.lianxi.drugs.pojo.OrderForm;
import com.lianxi.drugs.service.DrugSystemService;
import com.lianxi.drugs.vo.*;
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

    @Autowired
    private com.lianxi.drugs.dao.CreditOrderMapper creditOrderMapper;

    @Autowired
    private com.lianxi.drugs.dao.PayoffTabMapper payoffTabMapper;

    @Autowired
    private com.lianxi.drugs.dao.OrderlistInfoMapper orderlistInfoMapper;

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

    @Override
    public List<CreditOrderVO> queryAllCreditOrder() {
        return creditOrderMapper.selectAllCreditOrder();
    }

    @Override
    public List<PayoffTabVO> queryAllPayoffTab() {
        return payoffTabMapper.selectAllPayoffTab();
    }

    @Override
    public List<OrderlistVO> queryAllOrderlistInfo() {
        return orderlistInfoMapper.selectAllOrderInfo();
    }
}
