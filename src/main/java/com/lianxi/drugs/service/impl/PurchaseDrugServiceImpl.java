package com.lianxi.drugs.service.impl;

import com.lianxi.drugs.dao.PurchaseDrugMapper;
import com.lianxi.drugs.pojo.PurchaseDrug;
import com.lianxi.drugs.service.PurchaseDrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseDrugServiceImpl implements PurchaseDrugService {

    @Autowired
    private PurchaseDrugMapper purchaseDrugMapper;

    @Override
    public Integer addDrugToCaiGouDan(List<PurchaseDrug> list) {
        return purchaseDrugMapper.addDrugToCaiGouDan(list);
    }

    @Override
    public List<PurchaseDrug> queryPurchaseDrug(int[] idArr,int caigoudanId) {
        return purchaseDrugMapper.queryPurchaseDrug(idArr,caigoudanId);
    }

    @Override
    public Integer batchDeleteCaiGouDrug(List list) {
        return purchaseDrugMapper.batchDeleteCaiGouDrug(list);
    }



}
