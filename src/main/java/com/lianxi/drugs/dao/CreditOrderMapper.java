package com.lianxi.drugs.dao;


import com.lianxi.drugs.vo.CreditOrderVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CreditOrderMapper {
    //查询所有退货单
    List<CreditOrderVO> selectAllCreditOrder();
    //退货
    Integer updateCreditOrder(@Param("list") Integer[] list);
}