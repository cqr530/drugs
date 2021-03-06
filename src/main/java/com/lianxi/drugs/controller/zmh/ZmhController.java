package com.lianxi.drugs.controller.zmh;

import com.lianxi.drugs.common.ServerResponse;
import com.lianxi.drugs.dto.*;
import com.lianxi.drugs.pojo.*;
import com.lianxi.drugs.service.PayoffTabInfoService;
import com.lianxi.drugs.service.PayoffTabService;
import com.lianxi.drugs.service.zmh.ZmgItemService;
import com.lianxi.drugs.vo.JieSuanDanVo;
import com.lianxi.drugs.vo.TuiHuoDanVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("drug")
public class ZmhController {
    @Autowired
    private ZmgItemService zmgItemService;

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private PayoffTabService payoffTabService;

    @Autowired
    private PayoffTabInfoService payoffTabInfoService;

    /**
     *
     * @param queryDrugItemDto 模糊查询需要的类
     * @return ServerResponse code 状态码  data 数据 啊
     * 分页条件查询药品品目
     */
    @RequestMapping("queryAllItemPage")
    @ResponseBody
    public ServerResponse findItem(QueryDrugItemDto queryDrugItemDto){
        try {
            DataTableResult dataTableResult = zmgItemService.queryItem(queryDrugItemDto);
            return ServerResponse.success(dataTableResult);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }

    /**
     *
     * @param queryDrugMessageDto
     * @return  ServerResponse
     * 分页条件查询药品信息
     */
    @RequestMapping("queryAllDrugMessagePage")
    @ResponseBody
    public ServerResponse findDrugMessage(QueryDrugMessageDto queryDrugMessageDto){
        try {
            DataTableResult dataTableResult = zmgItemService.queryAllDrugMessage(queryDrugMessageDto);
            return ServerResponse.success(dataTableResult);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }

    /**
     *
     * @param queryPurchaseIndexDto
     * @return  ServerResponse
     * 分页，条件查询采购目录
     */
    @RequestMapping("queryAllCaiGouIndexPage")
    @ResponseBody
    public ServerResponse findAllCaiGouIndexPage(QueryPurchaseIndexDto queryPurchaseIndexDto){
        try {
            DataTableResult dataTableResult = zmgItemService.queryAllCaiGouIndexPage(queryPurchaseIndexDto);
            return ServerResponse.success(dataTableResult);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }

    /**
     *
     * @param hospitalDrugIndexDto
     * @return  ServerResponse
     * 分页，条件查询药品采购单目录 采购之前
     */
    @RequestMapping("queryAllHospitalDrugPage")
    @ResponseBody
    public ServerResponse findAllHospitalDrugPage(HospitalDrugIndexDto hospitalDrugIndexDto){
        try {
            User user = (User) request.getSession().getAttribute("user");
            Integer userCompany = user.getUserCompany();
            hospitalDrugIndexDto.setUserCompany(userCompany);

            DataTableResult dataTableResult = zmgItemService.queryAllHospitalDrugPage(hospitalDrugIndexDto);
            return ServerResponse.success(dataTableResult);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }

    /**
     *
     * @param caiGouDanDto
     * @return  ServerResponse
     * 分页，条件查询采购单
     */
    @RequestMapping("queryAllCaiGouDanPage")
    @ResponseBody
    public ServerResponse findAllCaiGouDanPage(CaiGouDanDto caiGouDanDto){
        try {
            HttpSession session = request.getSession();
            User user = (User) session.getAttribute("user");
            caiGouDanDto.setHospitalId(user.getUserCompany());

            DataTableResult dataTableResult = zmgItemService.queryAllCaiGouDanPage(caiGouDanDto);
            return ServerResponse.success(dataTableResult);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }

    /**
     *
     * @param
     * @return  ServerResponse
     * 查询医院
     */
    @RequestMapping("queryHospital")
    @ResponseBody
    public ServerResponse findHospital(){
        try {
            List<Hospital> dataTableResult = zmgItemService.findHospital();
            return ServerResponse.success(dataTableResult);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }

    /**
     *
     * @param   id
     * @return  ServerResponse
     * 根据采购单id查询采购单信息
     */
    @RequestMapping("queryCaiGouDanByIdEcho")
    @ResponseBody
    public ServerResponse findCaiGouDanByIdEcho(Integer id){
        try {
            //*通过采购单id回显采购单信息//
            Purchase purchaseList = zmgItemService.findCaiGouDanByIdEcho(id);
            return ServerResponse.success(purchaseList);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }

    /**
     *
     * @param   purchaseDrugDto
     * @return  ServerResponse
     * 根据采购单id查询采购单中的药品信息
     */
    @RequestMapping("queryCaiGouDanById")
    @ResponseBody
    public ServerResponse findCaiGouDanById(PurchaseDrugDto purchaseDrugDto){
        try {
            DataTableResult dataTableResult = zmgItemService.findPurchaseDrugById(purchaseDrugDto);
            return ServerResponse.success(dataTableResult);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }

/**
     *
     * @param   id
     * @return  ServerResponse
     * 根据采购单id查询采购单中的药品信息
     */
    @RequestMapping("deleteCaiGouDrug")
    @ResponseBody
    public ServerResponse deleteCaiGouDrug(Integer id){
        try {
            PurchaseDrug purchaseDrug = zmgItemService.queryCaiGouDugById(id);
            Integer id1 = purchaseDrug.getId();
            Integer code = zmgItemService.deleteCaiGouDrug(id1);
            if(code>0){
                return ServerResponse.success();
            }
            return ServerResponse.error();
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }

    /**
     *
     * @param   tuiHuoDanDto
     * @return  ServerResponse
     * 根据采购单id查询采购单中的药品信息
     */
    @RequestMapping("queryAllTuiHuoDanPage")
    @ResponseBody
    public ServerResponse queryAllTuiHuoDanPage(TuiHuoDanDto tuiHuoDanDto){
        try {
            DataTableResult dataTableResult = zmgItemService.queryAllTuiHuoDanPage(tuiHuoDanDto);
                return ServerResponse.success(dataTableResult);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }

    /**
     *
     * @param   id
     * @return  ServerResponse
     * 根据退货单id查询退货单信息
     */
    @RequestMapping("queryTuiHuoDanById")
    @ResponseBody
    public ServerResponse queryTuiHuoDanById(Integer id){
        try {
           TuiHuoDanVo tuiHuoDanVo = zmgItemService.queryTuiHuoDanById(id);
            return ServerResponse.success(tuiHuoDanVo);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }

    /**
     *
     * @param
     * @return  ServerResponse
     * 查询所有采购单和采购单中的商品
     */
    @RequestMapping("queryAllCaiGouDanAndDrugPage")
    @ResponseBody
    public ServerResponse queryAllCaiGouDanAndDrugPage(CaiGouDanAndDrugDto caiGouDanAndDrugDto){
        try {
            User user = (User) request.getSession().getAttribute("user");
            /*登录用户*/
            caiGouDanAndDrugDto.setUserCompany(user.getUserCompany());
            DataTableResult dataTableResult = zmgItemService.queryAllCaiGouDanAndDrugPage(caiGouDanAndDrugDto);
            return ServerResponse.success(dataTableResult);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }

    /**
     *
     * @param
     * @return  ServerResponse
     * 查询所有采购单和采购单中的商品
     */
    @RequestMapping("queryAllJieSuanDanPage")
    @ResponseBody
    public ServerResponse queryAllJieSuanDanPage(JieSuanDanDto jieSuanDanDto){
        try {
            DataTableResult dataTableResult = payoffTabService.queryAllJieSuanDanPage(jieSuanDanDto);
            return ServerResponse.success(dataTableResult);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }

    /**
     *
     * @param
     * @return  ServerResponse
     * 查询所有采购单和采购单中的商品
     */
    @RequestMapping("queryJieSuanDanById")
    @ResponseBody
    public ServerResponse queryJieSuanDanById(Integer id){
        try {
            JieSuanDanVo jieSuanDanVo = payoffTabService.queryJieSuanDanById(id);
            return ServerResponse.success(jieSuanDanVo);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }

    /**
     *
     * @param
     * @return  ServerResponse
     * 查询所有采购单和采购单中的商品
     */
    @RequestMapping("queryAllJieSuanDanAndDrugPage")
    @ResponseBody
    public ServerResponse queryAllJieSuanDanAndDrugPage(JieSuanDanInfoDto jieSuanDanInfoDto){
        try {
           User user = (User) request.getSession().getAttribute("user");
           jieSuanDanInfoDto.setUserCompany(user.getUserCompany());

            DataTableResult dataTableResult = payoffTabInfoService.queryAllJieSuanDanAndDrugPage(jieSuanDanInfoDto);
            return ServerResponse.success(dataTableResult);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }
}
