package com.lianxi.drugs.controller.zmh;

import com.lianxi.drugs.common.ServerResponse;
import com.lianxi.drugs.dto.HospitalDrugIndexDto;
import com.lianxi.drugs.dto.QueryDrugItemDto;
import com.lianxi.drugs.dto.QueryDrugMessageDto;
import com.lianxi.drugs.dto.QueryPurchaseIndexDto;
import com.lianxi.drugs.pojo.DataTableResult;
import com.lianxi.drugs.pojo.User;
import com.lianxi.drugs.service.zmh.ZmgItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

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
     * 分页，条件查询药品采购单目录 采购之前
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
}
