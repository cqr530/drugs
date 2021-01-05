package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.Item;
import com.lianxi.drugs.vo.ItemVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemMapper {
    //查询所有药品品目
    List<Item> selectAllItem();
    //模糊查询
    List<Item> selectAllItemLike(@Param("itemVO") ItemVO itemVO);
}