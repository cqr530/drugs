package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.OrderForm;

public interface OrderFormMapper {
    int deleteByPrimaryKey(Integer orId);

    int insert(OrderForm record);

    int insertSelective(OrderForm record);

    OrderForm selectByPrimaryKey(Integer orId);

    int updateByPrimaryKeySelective(OrderForm record);

    int updateByPrimaryKey(OrderForm record);
}