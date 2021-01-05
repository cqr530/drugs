package com.lianxi.drugs.service.zmh;

import com.lianxi.drugs.dto.QueryDrugItemDto;
import com.lianxi.drugs.dto.QueryDrugMessageDto;
import com.lianxi.drugs.dto.QueryPurchaseIndexDto;
import com.lianxi.drugs.pojo.DataTableResult;

public interface ZmgItemService {
    DataTableResult queryItem(QueryDrugItemDto queryDrugItemDto);

    DataTableResult queryAllDrugMessage(QueryDrugMessageDto queryDrugMessageDto);

    DataTableResult queryAllCaiGouIndexPage(QueryPurchaseIndexDto queryPurchaseIndexDto);
}
