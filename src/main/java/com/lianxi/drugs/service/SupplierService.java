package com.lianxi.drugs.service;

public interface SupplierService {
    //添加供货药品
    Integer saveDrugs(Integer[] list);
    //取消供货药品
    Integer cncelDrugs(Integer[] list);
    //发货
    Integer modifyOrder(Integer[] list);
}
