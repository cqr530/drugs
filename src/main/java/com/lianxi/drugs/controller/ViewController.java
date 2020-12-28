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
    public String toCaiGouDan(){
        return "/caigoudan-add";
    }
}
