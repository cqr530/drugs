package com.lianxi.drugs.service;

import com.lianxi.drugs.pojo.DrugInfo;
import com.lianxi.drugs.vo.DruginfoVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SupplierService {
    //添加供货药品
    Integer saveDrugs(Integer[] list);
    //取消供货药品
    Integer cncelDrugs(Integer[] list);
    //供货维护模糊查询
    List<DrugInfo> queryAllDrugsLike(DruginfoVO druginfoVO);
    //发货
    Integer modifyOrder(Integer[] list);
    //退货
    Integer modifyCreditOrder(Integer[] list);
    //结算
    Integer modifyPayoffTab(Integer[] list);
}
