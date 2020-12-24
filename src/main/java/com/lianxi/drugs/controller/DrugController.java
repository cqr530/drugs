package com.lianxi.drugs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DrugController {
    @Autowired
    private com.lianxi.drugs.service.DrugSystemService drugSystemService;


    /**
     *
     * @param id
     * @param pwd
     * @return 登录接口
     */
    @RequestMapping("/denglu")
    @ResponseBody
    public int finduser(@RequestParam("id")Integer id,@RequestParam("pwd") String pwd){
        return drugSystemService.queryuser(id, pwd);
    }
}
