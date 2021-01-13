package com.lianxi.drugs.controller.zmh;

import com.lianxi.drugs.common.ServerResponse;
import com.lianxi.drugs.dto.*;
import com.lianxi.drugs.pojo.DataTableResult;
import com.lianxi.drugs.pojo.DrugInfo;
import com.lianxi.drugs.pojo.Hospital;
import com.lianxi.drugs.pojo.User;
import com.lianxi.drugs.service.zmh.ZmgItemService;
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
    @RequestMapping("queryCaiGouDanById")
    @ResponseBody
    public ServerResponse findCaiGouDanById(Integer id){
        try {
            /*通过采购单id获取采购单中的商品集合*/
            List<DrugInfo> drugInfoList = zmgItemService.findPurchaseDrugById(id);
            return ServerResponse.success(drugInfoList);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }


}
