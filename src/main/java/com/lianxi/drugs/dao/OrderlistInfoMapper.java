package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.OrderlistInfo;

public interface OrderlistInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderlistInfo record);

    int insertSelective(OrderlistInfo record);

    OrderlistInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderlistInfo record);

    int updateByPrimaryKey(OrderlistInfo record);
}