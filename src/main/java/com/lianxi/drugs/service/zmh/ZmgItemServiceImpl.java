package com.lianxi.drugs.service.zmh;

import com.lianxi.drugs.dao.ZmhItemMapper;
import com.lianxi.drugs.dto.*;
import com.lianxi.drugs.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZmgItemServiceImpl implements ZmgItemService{
    @Autowired
    private ZmhItemMapper zmhItemMapper;

    /*药品品目*/
    @Override
    public DataTableResult queryItem(QueryDrugItemDto queryDrugItemDto) {
        List<Item> itemList = zmhItemMapper.queryItem(queryDrugItemDto);
        long count = zmhItemMapper.queryDrugItemCount(queryDrugItemDto);
        DataTableResult dataTableResult = new DataTableResult(queryDrugItemDto.getDraw(),count,count,itemList);
        return dataTableResult;
    }

    /*药品信息*/
    @Override
    public DataTableResult queryAllDrugMessage(QueryDrugMessageDto queryDrugMessageDto) {
        List<DrugInfo> drugInfoList = zmhItemMapper.queryAllDrugMessage(queryDrugMessageDto);
        long count = zmhItemMapper.queryAllDrugMessageCount(queryDrugMessageDto);
        DataTableResult dataTableResult = new DataTableResult(queryDrugMessageDto.getDraw(),count,count,drugInfoList);
        return dataTableResult;    }

    @Override
    public DataTableResult queryAllCaiGouIndexPage(QueryPurchaseIndexDto queryPurchaseIndexDto) {
        List<DrugInfo> drugInfoList = zmhItemMapper.queryAllCaiGouIndexPage(queryPurchaseIndexDto);
        long count = zmhItemMapper.queryAllCaiGouIndexCount(queryPurchaseIndexDto);
        DataTableResult dataTableResult = new DataTableResult(queryPurchaseIndexDto.getDraw(),count,count,drugInfoList);
        return dataTableResult;
    }

    @Override
    public DataTableResult queryAllHospitalDrugPage(HospitalDrugIndexDto hospitalDrugIndexDto) {
        List<HospitalDrug> hospitalDrugList = zmhItemMapper.queryAllHospitalDrugPage(hospitalDrugIndexDto);
        long count = zmhItemMapper.queryAllHospitalDrugCount(hospitalDrugIndexDto);
        DataTableResult dataTableResult = new DataTableResult(hospitalDrugIndexDto.getDraw(),count,count,hospitalDrugList);
        return dataTableResult;
    }

    @Override
    public DataTableResult queryAllCaiGouDanPage(CaiGouDanDto caiGouDanDto) {
        List<Purchase> purchaseList = zmhItemMapper.queryAllCaiGouDanPage(caiGouDanDto);
        long count = zmhItemMapper.queryAllCaiGouDanCount(caiGouDanDto);
        DataTableResult dataTableResult = new DataTableResult(caiGouDanDto.getDraw(),count,count,purchaseList);
        return dataTableResult;
    }

    @Override
    public List<Hospital> findHospital() {
        return zmhItemMapper.queryHospital();
    }
}
