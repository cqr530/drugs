package com.lianxi.drugs.dao;

import com.lianxi.drugs.dto.CaiGouDanDto;
import com.lianxi.drugs.pojo.Purchase;

public interface PurchaseMapper {

    int caiGouDanMapper(CaiGouDanDto caiGouDanDto);

    Purchase findCaiGouDanByIdEcho(Integer id);




    int deleteByPrimaryKey(Integer payoffTabId);

    int insert(Purchase record);

    int insertSelective(Purchase record);

    Purchase selectByPrimaryKey(Integer payoffTabId);

    int updateByPrimaryKeySelective(Purchase record);

    int updateByPrimaryKey(Purchase record);

    Integer toDeleteCaiGouDan(Integer id);


}