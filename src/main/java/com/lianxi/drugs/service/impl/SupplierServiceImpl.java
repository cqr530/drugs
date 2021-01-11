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

    @Override
    public Integer saveDrugs(Integer[] list) {
        return supplierDrugMenuMapper.addDrugs(list);
    }
}
