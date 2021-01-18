package com.lianxi.drugs.service;

import com.lianxi.drugs.pojo.*;
import com.lianxi.drugs.vo.CreditOrderVO;
import com.lianxi.drugs.vo.DruginfoVO;
import com.lianxi.drugs.vo.ItemVO;
import com.lianxi.drugs.vo.OrderVO;
import com.lianxi.drugs.pojo.DrugClazz;
import com.lianxi.drugs.pojo.DrugInfo;
import com.lianxi.drugs.pojo.Item;
import com.lianxi.drugs.pojo.DrugtranlStatus;
import com.lianxi.drugs.pojo.QualityLevel;
import com.lianxi.drugs.vo.*;

import java.util.List;

public interface DrugSystemService {

    /**
     * 登录
     * @param name
     * @param pwd
     * @return
     */
    User queryUser(String name, String pwd);

    /**
     * 查找全部药品信息
     * @return
     */
    List<DrugInfo> queryDrug();

    /**
     * 查找全部药类型信息
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

    /**
     * 查询所有退货单
     * @return
     */
    List<CreditOrderVO> queryAllCreditOrder();

    /**
     * 查询所有结算单
     * @return
     */
    List<PayoffTabVO> queryAllPayoffTab();

    /**
     * 按采购单查询
     * @return
     */
    List<OrderlistVO> queryAllOrderlistInfo();

    /**
     * 查询所有交易状态
     * @return
     */
    List<DrugtranlStatus> queryAllDrugtranlStatus();

    /**
     * 查询所有质量层次
     * @return
     */
    List<QualityLevel> queryAllQualityLevel();
}
