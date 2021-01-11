package com.lianxi.drugs.dao;

import com.lianxi.drugs.dto.*;
import com.lianxi.drugs.pojo.*;

import java.util.List;

public interface ZmhItemMapper {
    /*药品品目*/
    List<Item> queryItem(QueryDrugItemDto queryDrugItemDto);

    long queryDrugItemCount(QueryDrugItemDto queryDrugItemDto);

    /*药品信息*/
    List<DrugInfo> queryAllDrugMessage(QueryDrugMessageDto queryDrugMessageDto);

    long queryAllDrugMessageCount(QueryDrugMessageDto queryDrugMessageDto);

    /*查询采购目录*/
    List<DrugInfo> queryAllCaiGouIndexPage(QueryPurchaseIndexDto queryPurchaseIndexDto);

    long queryAllCaiGouIndexCount(QueryPurchaseIndexDto queryPurchaseIndexDto);

    /*查询采购到医院的药品信息*/
    List<HospitalDrug> queryAllHospitalDrugPage(HospitalDrugIndexDto hospitalDrugIndexDto);

    long queryAllHospitalDrugCount(HospitalDrugIndexDto hospitalDrugIndexDto);

    /*采购单查询*/
    List<Purchase> queryAllCaiGouDanPage(CaiGouDanDto caiGouDanDto);

    long queryAllCaiGouDanCount(CaiGouDanDto caiGouDanDto);

    List<Hospital> queryHospital();
}
