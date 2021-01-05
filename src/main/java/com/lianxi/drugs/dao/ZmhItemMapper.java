package com.lianxi.drugs.dao;

import com.lianxi.drugs.dto.QueryDrugItemDto;
import com.lianxi.drugs.dto.QueryDrugMessageDto;
import com.lianxi.drugs.pojo.DrugInfo;
import com.lianxi.drugs.pojo.Item;

import java.util.List;

public interface ZmhItemMapper {
    /*药品品目*/
    List<Item> queryItem(QueryDrugItemDto queryDrugItemDto);

    long queryDrugItemCount(QueryDrugItemDto queryDrugItemDto);

    /*药品信息*/
    List<DrugInfo> queryAllDrugMessage(QueryDrugMessageDto queryDrugMessageDto);

    long queryAllDrugMessageCount(QueryDrugMessageDto queryDrugMessageDto);
}
