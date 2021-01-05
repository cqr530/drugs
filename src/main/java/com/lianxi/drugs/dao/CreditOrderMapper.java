package com.lianxi.drugs.dao;


import com.lianxi.drugs.vo.CreditOrderVO;

import java.util.List;

public interface CreditOrderMapper {
    //查询所有退货单
    List<CreditOrderVO> selectAllCreditOrder();
}