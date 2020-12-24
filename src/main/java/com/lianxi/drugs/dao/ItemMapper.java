package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.Item;

public interface ItemMapper {
    int deleteByPrimaryKey(String drugCategoryId);

    int insert(Item record);

    int insertSelective(Item record);

    Item selectByPrimaryKey(String drugCategoryId);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);
}