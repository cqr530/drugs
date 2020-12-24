package com.lianxi.drugs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/drugs")
public class DrugController {
    @Autowired
    private com.lianxi.drugs.service.DrugSystemService drugSystemService;


    /**
     *2020.12.24 陈泉润
     * @param id
     * @param pwd
     * @return 登录接口
     */
    @RequestMapping("/denglu")
    public int finduser(@RequestParam("id")Integer id,@RequestParam("pwd") String pwd){
        return drugSystemService.queryuser(id, pwd);
    }


}
