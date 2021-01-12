package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.OrderForm;
import com.lianxi.drugs.vo.OrderVO;

import java.util.List;

public interface OrderFormMapper {
    //查询所有订单
    List<OrderVO> selectAllOrder();






















    int deleteByPrimaryKey(Integer orId);

    int insert(OrderForm record);

    int insertSelective(OrderForm record);

    OrderForm selectByPrimaryKey(Integer orId);

    int updateByPrimaryKeySelective(OrderForm record);

    int updateByPrimaryKey(OrderForm record);
}