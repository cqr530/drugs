package com.lianxi.drugs.controller;

import com.lianxi.drugs.pojo.DrugClazz;
import com.lianxi.drugs.pojo.DrugInfo;
import com.lianxi.drugs.pojo.Item;
import com.lianxi.drugs.pojo.OrderForm;
import com.lianxi.drugs.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/drugs")
public class DrugController {
    @Autowired
    private com.lianxi.drugs.service.DrugSystemService drugSystemService;

    /**
     *2020.12.24 陈泉润
     * @param name
     * @param pwd
     * @return 登录接口
     */
    @RequestMapping("/denglu")
    public int findUser(@RequestParam("name")String name,@RequestParam("pwd") String pwd){
        return drugSystemService.queryUser(name,pwd);
    }

    /**
     * 2020.12.28 陈泉润
     * @return 查询所有药品类别
     */
    @RequestMapping("/drugclass")
    public List<DrugClazz> findDrugClazz(){
        List<DrugClazz> drugClazzes = drugSystemService.queryDrugClazz();
        return drugClazzes ;
    }
    /**
     * 2020.12.28 陈泉润
     * @return 查询所有药品品目
     */
    @RequestMapping("/allitem")
    public List<Item> findItem(){
        return drugSystemService.queryItem();
    }

    /**
     * 2020.12.28 陈泉润
     * @param itemVO
     * @return 药品品目模糊查询
     */
    @RequestMapping("/likeitem")
    public List<Item> likeFindItem(ItemVO itemVO){
        return drugSystemService.queryItemLike(itemVO);
    }
    /**
     * 2020.12.25 陈泉润
     * @return 查询所有药品信息
     */
    @RequestMapping("/alldrug")
    public List<DrugInfo> findDrug(){
        return drugSystemService.queryDrug();
    }

    /**
     * 2020.12.28 陈泉润
     * @param druginfoVO
     * @return 药品信息模糊查询
     */
    @RequestMapping("/likedrug")
    public List<DrugInfo> likeFindDrug(DruginfoVO druginfoVO){
        return drugSystemService.queryDrugLike(druginfoVO);
    }

    /**
     * 2020.12.30 陈泉润
     * @return 查询所有订单
     */
    @RequestMapping("/orders")
    public List<OrderVO> findOrders(){
        return drugSystemService.queryAllOrder();
    }

    /**
     * 2021.1.5 陈泉润
     * @return 查询所有退货单
     */
    @RequestMapping("/creditorders")
    public List<CreditOrderVO> findCreditOrders(){
        return drugSystemService.queryAllCreditOrder();
    }

    /**
     * 2021.1.6 陈泉润
     * @return 查询所有结算单
     */
    @RequestMapping("/payofftab")
    public List<PayoffTabVO> findPayoffTab(){
        return drugSystemService.queryAllPayoffTab();
    }
    /**
     * 2021.1.6 陈泉润
     * @return 按采购单查询所有
     */
    @RequestMapping("/orderinfo")
    public List<OrderlistVO> findOrderlistInfo(){
        return drugSystemService.queryAllOrderlistInfo();
    }
}
