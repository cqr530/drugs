package com.lianxi.drugs.dao;

import com.lianxi.drugs.dto.QueryDrugItemDto;
import com.lianxi.drugs.pojo.Item;

import java.util.List;

public interface ZmhItemMapper {
    List<Item> queryItem(QueryDrugItemDto queryDrugItemDto);

    long queryDrugItemCount(QueryDrugItemDto queryDrugItemDto);
}
