package com.lianxi.drugs.service.zmh;

import com.lianxi.drugs.dao.CreditOrderMapper;
import com.lianxi.drugs.dao.PurchaseDrugMapper;
import com.lianxi.drugs.dao.PurchaseMapper;
import com.lianxi.drugs.dao.ZmhItemMapper;
import com.lianxi.drugs.dto.*;
import com.lianxi.drugs.pojo.*;
import com.lianxi.drugs.vo.CaiGouDanAndDrugVo;
import com.lianxi.drugs.vo.CaiGouDrugVo;
import com.lianxi.drugs.vo.TuiHuoDanVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZmgItemServiceImpl implements ZmgItemService{
    @Autowired
    private ZmhItemMapper zmhItemMapper;

    @Autowired
    private PurchaseDrugMapper purchaseDrugMapper;

    @Autowired
    private PurchaseMapper purchaseMapper;

    @Autowired
    private CreditOrderMapper creditOrderMapper;

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

    @Override
    public DataTableResult findPurchaseDrugById(PurchaseDrugDto purchaseDrugDto) {
        List<CaiGouDrugVo> caiGouDrugVoList = purchaseDrugMapper.queryPurchaseDrugById(purchaseDrugDto);
        long count = purchaseDrugMapper.queryPurchaseDrugCount(purchaseDrugDto);
        DataTableResult dataTableResult = new DataTableResult(purchaseDrugDto.getDraw(),count,count,caiGouDrugVoList);
        return dataTableResult;
    }

    @Override
    public Purchase findCaiGouDanByIdEcho(Integer id) {
        return purchaseMapper.findCaiGouDanByIdEcho(id);
    }

    @Override
    public Integer deleteCaiGouDrug(Integer id) {
        return purchaseDrugMapper.deleteCaiGouDrug(id);
    }

    @Override
    public PurchaseDrug queryCaiGouDugById(Integer id) {
        return purchaseDrugMapper.queryCaiGouDugById(id);
    }

    @Override
    public DataTableResult queryAllTuiHuoDanPage(TuiHuoDanDto tuiHuoDanDto) {
        List<CreditOrder> creditOrderList = creditOrderMapper.queryAllTuiHuoDanPage(tuiHuoDanDto);
        long count = creditOrderMapper.queryAllTuiHuoDanCount(tuiHuoDanDto);
        DataTableResult dataTableResult = new DataTableResult(tuiHuoDanDto.getDraw(),count,count,creditOrderList);
        return dataTableResult;
    }

    @Override
    public TuiHuoDanVo queryTuiHuoDanById(Integer id) {
        return creditOrderMapper.queryTuiHuoDanById(id);
    }

    @Override
    public DataTableResult queryAllCaiGouDanAndDrugPage(CaiGouDanAndDrugDto caiGouDanAndDrugDto) {
        List<CaiGouDanAndDrugVo> caiGouDanAndDrugVoList = purchaseDrugMapper.queryAllCaiGouDanAndDrugPage(caiGouDanAndDrugDto);
        long count = purchaseDrugMapper.queryAllCaiGouDanAndDrugCount(caiGouDanAndDrugDto);
        DataTableResult dataTableResult = new DataTableResult(caiGouDanAndDrugDto.getDraw(),count,count,caiGouDanAndDrugVoList);
        return dataTableResult;
    }
}
