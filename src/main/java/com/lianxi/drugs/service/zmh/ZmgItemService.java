package com.lianxi.drugs.service.zmh;

import com.lianxi.drugs.dto.*;
import com.lianxi.drugs.pojo.DataTableResult;
import com.lianxi.drugs.pojo.DrugInfo;
import com.lianxi.drugs.pojo.Hospital;

import java.util.List;

public interface ZmgItemService {
    DataTableResult queryItem(QueryDrugItemDto queryDrugItemDto);

    DataTableResult queryAllDrugMessage(QueryDrugMessageDto queryDrugMessageDto);

    DataTableResult queryAllCaiGouIndexPage(QueryPurchaseIndexDto queryPurchaseIndexDto);

    DataTableResult queryAllHospitalDrugPage(HospitalDrugIndexDto hospitalDrugIndexDto);

    DataTableResult queryAllCaiGouDanPage(CaiGouDanDto caiGouDanDto);

    List<Hospital> findHospital();

    List<DrugInfo> findPurchaseDrugById(Integer id);

}
