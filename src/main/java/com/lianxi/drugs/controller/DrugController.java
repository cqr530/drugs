package com.lianxi.drugs.controller;

import com.lianxi.drugs.pojo.DrugInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
        return drugSystemService.queryUser(name, pwd);
    }

    /**
     * 2020.12.25 陈泉润
     * @return 查询所有药品信息
     */
    @RequestMapping("/alldrug")
    public List<DrugInfo> findDrug(){
        return drugSystemService.queryDrug();
    }
}
