package com.lianxi.drugs.service;

import com.lianxi.drugs.pojo.PurchaseDrug;

import java.util.List;

public interface PurchaseDrugService {
    Integer addDrugToCaiGouDan(List<PurchaseDrug> list);

    Integer batchDeleteCaiGouDrug(List list);

    List<PurchaseDrug> queryPurchaseDrug(int[] idArr,int caigoudanId);
}
