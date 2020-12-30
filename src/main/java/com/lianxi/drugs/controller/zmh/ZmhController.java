package com.lianxi.drugs.controller.zmh;

import com.lianxi.drugs.common.ServerResponse;
import com.lianxi.drugs.dto.QueryDrugItemDto;
import com.lianxi.drugs.pojo.DataTableResult;
import com.lianxi.drugs.service.zmh.ZmgItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("drug")
public class ZmhController {
    @Autowired
    private ZmgItemService zmgItemService;

    /**
     *
     * @param queryDrugItemDto 模糊查询需要的类
     * @return  Map code 状态码  data 数据 啊
     */
    @RequestMapping("queryAllItemPage")
    @ResponseBody
    public ServerResponse findItem(QueryDrugItemDto queryDrugItemDto){
        Map map = new HashMap<>();
        try {
            DataTableResult dataTableResult = zmgItemService.queryItem(queryDrugItemDto);
            map.put("code",200);
            map.put("data",dataTableResult);
            return ServerResponse.success(dataTableResult);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }

}
