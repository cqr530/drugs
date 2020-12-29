package com.lianxi.drugs.service.zmh;

import com.lianxi.drugs.dto.QueryDrugItemDto;
import com.lianxi.drugs.pojo.DataTableResult;

public interface ZmgItemService {
    DataTableResult queryItem(QueryDrugItemDto queryDrugItemDto);
}
