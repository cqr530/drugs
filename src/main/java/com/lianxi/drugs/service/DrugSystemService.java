package com.lianxi.drugs.service;

import com.lianxi.drugs.pojo.DrugClazz;
import com.lianxi.drugs.pojo.DrugInfo;
import com.lianxi.drugs.pojo.Item;
import com.lianxi.drugs.pojo.OrderForm;
import com.lianxi.drugs.vo.DruginfoVO;
import com.lianxi.drugs.vo.ItemVO;
import com.lianxi.drugs.vo.OrderVO;

import java.util.List;

public interface DrugSystemService {

    /**
     * 登录
     * @param name
     * @param pwd
     * @return
     */
    Integer queryUser (String name,String pwd);

    /**
     * 查找全部药品信息
     * @return
     */
    List<DrugInfo> queryDrug();

    /**
     * 查找全部药品别信息
     * @return
     */
    List<DrugClazz> queryDrugClazz();

    /**
     * 模糊查询
     * @param druginfoVO
     * @return
     */
    List<DrugInfo> queryDrugLike(DruginfoVO druginfoVO);

    /**
     * 查找全部药品品目
     * @return
     */
    List<Item> queryItem();

    /**
     * 模糊查询药品品目
     * @param itemVO
     * @return
     */
    List<Item> queryItemLike(ItemVO itemVO);

    /**
     * 查询所有订单
     * @return
     */
    List<OrderVO> queryAllOrder();
}
