package com.lianxi.drugs.dao;

import com.lianxi.drugs.vo.OrderlistVO;

import java.util.List;

public interface OrderlistInfoMapper {
    //按采购单查询
    List<OrderlistVO> selectAllOrderInfo();
}