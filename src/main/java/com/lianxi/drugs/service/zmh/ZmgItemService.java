package com.lianxi.drugs.service.zmh;

import com.lianxi.drugs.dto.*;
import com.lianxi.drugs.pojo.DataTableResult;
import com.lianxi.drugs.pojo.Hospital;
import com.lianxi.drugs.pojo.Purchase;
import com.lianxi.drugs.pojo.PurchaseDrug;
import com.lianxi.drugs.vo.TuiHuoDanVo;

import java.util.List;

public interface ZmgItemService {
    DataTableResult queryItem(QueryDrugItemDto queryDrugItemDto);

    DataTableResult queryAllDrugMessage(QueryDrugMessageDto queryDrugMessageDto);

    DataTableResult queryAllCaiGouIndexPage(QueryPurchaseIndexDto queryPurchaseIndexDto);

    DataTableResult queryAllHospitalDrugPage(HospitalDrugIndexDto hospitalDrugIndexDto);

    DataTableResult queryAllCaiGouDanPage(CaiGouDanDto caiGouDanDto);

    List<Hospital> findHospital();

    DataTableResult findPurchaseDrugById(PurchaseDrugDto purchaseDrugDto);

    Purchase findCaiGouDanByIdEcho(Integer id);

    Integer deleteCaiGouDrug(Integer id);

    PurchaseDrug queryCaiGouDugById(Integer id);

    DataTableResult queryAllTuiHuoDanPage(TuiHuoDanDto tuiHuoDanDto);

    TuiHuoDanVo queryTuiHuoDanById(Integer id);

    DataTableResult queryAllCaiGouDanAndDrugPage(CaiGouDanAndDrugDto caiGouDanAndDrugDto);

}
