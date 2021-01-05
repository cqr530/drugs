package com.lianxi.drugs.service.zmh;

import com.lianxi.drugs.dao.ZmhItemMapper;
import com.lianxi.drugs.dto.QueryDrugItemDto;
import com.lianxi.drugs.dto.QueryDrugMessageDto;
import com.lianxi.drugs.dto.QueryPurchaseIndexDto;
import com.lianxi.drugs.pojo.DataTableResult;
import com.lianxi.drugs.pojo.DrugInfo;
import com.lianxi.drugs.pojo.Item;
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
}
