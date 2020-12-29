package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.DrugInfo;
import com.lianxi.drugs.pojo.Item;
import com.lianxi.drugs.vo.DruginfoVO;
import com.lianxi.drugs.vo.ItemVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemMapper {
    //查询所有药品品目
    List<Item> selectAllItem();
    //模糊查询
    List<Item> selectAllItemLike(@Param("itemVO") ItemVO itemVO);





































    int deleteByPrimaryKey(String drugCategoryId);

    int insert(Item record);

    int insertSelective(Item record);

    Item selectByPrimaryKey(String drugCategoryId);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);
}