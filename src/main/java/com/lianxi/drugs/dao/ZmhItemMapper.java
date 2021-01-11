package com.lianxi.drugs.dao;

import com.lianxi.drugs.dto.HospitalDrugIndexDto;
import com.lianxi.drugs.dto.QueryDrugItemDto;
import com.lianxi.drugs.dto.QueryDrugMessageDto;
import com.lianxi.drugs.dto.QueryPurchaseIndexDto;
import com.lianxi.drugs.pojo.DrugInfo;
import com.lianxi.drugs.pojo.HospitalDrug;
import com.lianxi.drugs.pojo.Item;

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

}
