package com.lianxi.drugs.dao;

import com.lianxi.drugs.dto.CaiGouDanAndDrugDto;
import com.lianxi.drugs.dto.PurchaseDrugDto;
import com.lianxi.drugs.pojo.PurchaseDrug;
import com.lianxi.drugs.vo.CaiGouDanAndDrugVo;
import com.lianxi.drugs.vo.CaiGouDrugVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PurchaseDrugMapper {

    Integer addDrugToCaiGouDan(List<PurchaseDrug> list);



    List<CaiGouDrugVo> queryPurchaseDrugById(PurchaseDrugDto purchaseDrugDto);

    long queryPurchaseDrugCount(PurchaseDrugDto purchaseDrugDto);

    PurchaseDrug queryCaiGouDugById(Integer id);

    List<PurchaseDrug> queryPurchaseDrug(@Param("idArr") int[] idArr,@Param("caigoudanId") int caigoudanId);

    Integer batchDeleteCaiGouDrug(List list);

    Integer deleteCaiGouDrug(Integer id);


    List<CaiGouDanAndDrugVo> queryAllCaiGouDanAndDrugPage(CaiGouDanAndDrugDto caiGouDanAndDrugDto);

    long queryAllCaiGouDanAndDrugCount(CaiGouDanAndDrugDto caiGouDanAndDrugDto);


























    int deleteByPrimaryKey(Integer orderNum);

    int insert(PurchaseDrug record);

    int insertSelective(PurchaseDrug record);

    PurchaseDrug selectByPrimaryKey(Integer orderNum);

    int updateByPrimaryKeySelective(PurchaseDrug record);

    int updateByPrimaryKey(PurchaseDrug record);

}