package com.lianxi.drugs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping("/")
    public String toIndex(){
        return "/login";
    }

    /**
     * 跳转到主页面
     * @return
     */
    @RequestMapping("/drug")
    public String toDrug(){
        return "/drug";
    }


    /**
     * 跳转到添加采购单的页面
     * @return
     */
    @RequestMapping("/selectAndAddCaiGouDan")
    public String toCaiGouDan() {
        return "/caigoudan-add";
    }

    /**
     * 跳转到创建退货单的页面
     * @return
     */
    @RequestMapping("/redirectionToReturnGoodsDan")
    public String redirectionToReturnGoodsDan(){
        return "/ReturnGoodsDan";
    }

    /**
     * 跳转到创建结算单的页面
     * @return
     */
    @RequestMapping("/redirectionToSettlementDan")
    public String redirectionToSettlementDan(){
        return "/SettlementDan";
    }

    /**
     * 药品目录查询页面
     * @return
     */
    @RequestMapping("/drugindex")
    public String DrugIndex(){
        return "/drugindex";
    }

    /**
     * 药品品目查询页面
     * @return
     */
    @RequestMapping("/drugselect")
    public String DrugSelect(){
        return "/drugSelect";
    }

    /**
     * 供应商商品选择
     * @return
     */
    @RequestMapping("/supplierdrug")
    public String supplierdrug(){
        return "/supplierdrug";
    }

    /**
     * 取消供应商品选择
     * @return
     */
    @RequestMapping("/cancelsupplierdrug")
    public String cancelsupplierdrug(){
        return "/cancelsupplierdrug";
    }

    /**
     * 供应商商品维护
     * @return
     */
    @RequestMapping("/maintainsupplierdrug")
    public String maintainsupplierdrug(){
        return "/maintainsupplierdrug";
    }


    /**
     * 采购单处理查询
     * @return
     */
    @RequestMapping("/Order")
    public String Order() {
        return "/Order";
    }

    /**
     * 退货单处理查询
     * @return
     */
    @RequestMapping("/creditorders")
    public String Creditorders() {
        return "/credit_order";
    }

    /**
     * 结算单处理查询
     * @return
     */
    @RequestMapping("/payofftab")
    public String Payofftab(){
        return "/payoff_tab";
    }

    /**
     * 跳转到退货单添加页面
     * @return
     */
    @RequestMapping("/toAddTuiHuoDanPage")
    public String toAddTuiHuoDanPage(){
        return "/ReturnGoodsDan";
    }
}
