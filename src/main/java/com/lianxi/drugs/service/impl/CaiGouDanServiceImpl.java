package com.lianxi.drugs.service.impl;

import com.lianxi.drugs.dao.PurchaseMapper;
import com.lianxi.drugs.dto.CaiGouDanDto;
import com.lianxi.drugs.service.CaiGouDanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaiGouDanServiceImpl implements CaiGouDanService {

    @Autowired
    private PurchaseMapper caiGouDanMapper;

    @Override
    public int createCaiGouDan(CaiGouDanDto caiGouDanDto) {
        return caiGouDanMapper.caiGouDanMapper(caiGouDanDto);
    }

    @Override
    public Integer toDeleteCaiGouDan(Integer id) {
        return caiGouDanMapper.toDeleteCaiGouDan(id);
    }
}
