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
     * 药品目录查询页面
     * @return
     */
    @RequestMapping("/drugindex")
    public String DrugIndex(){
        return "/drugindex";
    }
}
