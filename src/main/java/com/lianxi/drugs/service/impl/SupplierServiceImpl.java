package com.lianxi.drugs.service.impl;

import com.lianxi.drugs.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private com.lianxi.drugs.dao.supplierDrugMenuMapper supplierDrugMenuMapper;
    @Autowired
    private com.lianxi.drugs.dao.OrderFormMapper orderFormMapper;
    @Autowired
    private com.lianxi.drugs.dao.CreditOrderMapper creditOrderMapper;

    @Override
    public Integer saveDrugs(Integer[] list) {
        return supplierDrugMenuMapper.insertDrugs(list);
    }

    @Override
    public Integer cncelDrugs(Integer[] list) {
        return supplierDrugMenuMapper.deleteDrugs(list);
    }

    @Override
    public Integer modifyOrder(Integer[] list) {
        return orderFormMapper.updateOrder(list);
    }

    @Override
    public Integer modifyCreditOrder(Integer[] list) {
        return creditOrderMapper.updateCreditOrder(list);
    }
}
