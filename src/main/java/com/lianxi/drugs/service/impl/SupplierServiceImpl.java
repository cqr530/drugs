package com.lianxi.drugs.service.impl;

import com.lianxi.drugs.pojo.DrugInfo;
import com.lianxi.drugs.service.SupplierService;
import com.lianxi.drugs.vo.DruginfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private com.lianxi.drugs.dao.supplierDrugMenuMapper supplierDrugMenuMapper;
    @Autowired
    private com.lianxi.drugs.dao.OrderFormMapper orderFormMapper;
    @Autowired
    private com.lianxi.drugs.dao.CreditOrderMapper creditOrderMapper;
    @Autowired
    private com.lianxi.drugs.dao.PayoffTabMapper payoffTabMapper;

    @Override
    public Integer saveDrugs(Integer[] list) {
        return supplierDrugMenuMapper.insertDrugs(list);
    }

    @Override
    public Integer cncelDrugs(Integer[] list) {
        return supplierDrugMenuMapper.deleteDrugs(list);
    }

    @Override
    public List<DrugInfo> queryAllDrugsLike(DruginfoVO druginfoVO) {
        return supplierDrugMenuMapper.selectAllDrugsLike(druginfoVO);
    }

    @Override
    public Integer modifyOrder(Integer[] list) {
        return orderFormMapper.updateOrder(list);
    }

    @Override
    public Integer modifyCreditOrder(Integer[] list) {
        return creditOrderMapper.updateCreditOrder(list);
    }

    @Override
    public Integer modifyPayoffTab(Integer[] list) {
        return payoffTabMapper.updatePayoffTab(list);
    }
}
