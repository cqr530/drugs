package com.lianxi.drugs.service.zmh;

import com.lianxi.drugs.dao.ZmhItemMapper;
import com.lianxi.drugs.dto.QueryDrugItemDto;
import com.lianxi.drugs.pojo.DataTableResult;
import com.lianxi.drugs.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZmgItemServiceImpl implements ZmgItemService{
    @Autowired
    private ZmhItemMapper zmhItemMapper;


    @Override
    public DataTableResult queryItem(QueryDrugItemDto queryDrugItemDto) {
        List<Item> itemList = zmhItemMapper.queryItem(queryDrugItemDto);
        long count = zmhItemMapper.queryDrugItemCount(queryDrugItemDto);
        DataTableResult dataTableResult = new DataTableResult(queryDrugItemDto.getDraw(),count,count,itemList);
        return dataTableResult;
    }
}
