package com.lianxi.drugs.controller;

import com.lianxi.drugs.pojo.DrugClazz;
import com.lianxi.drugs.pojo.DrugInfo;
import com.lianxi.drugs.pojo.Item;
import com.lianxi.drugs.vo.DruginfoVO;
import com.lianxi.drugs.vo.ItemVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
     * 2020.12.28 陈泉润
     * @return 查询所有药品类别
     */
    @RequestMapping("/drugclass")
    public List<DrugClazz> findDrugClazz(){
        List<DrugClazz> drugClazzes = drugSystemService.queryDrugClazz();
        return drugClazzes ;
    }
    /**
     * 2020.12.28 陈泉润
     * @return 查询所有药品品目
     */
    @RequestMapping("/allitem")
    public List<Item> findItem(){
        return drugSystemService.queryItem();
    }

    /**
     * 2020.12.28 陈泉润
     * @param itemVO
     * @return 药品品目模糊查询
     */
    @RequestMapping("/likeitem")
    public List<Item> likeFindItem(ItemVO itemVO){
        return drugSystemService.queryItemLike(itemVO);
    }
    /**
     * 2020.12.25 陈泉润
     * @return 查询所有药品信息
     */
    @RequestMapping("/alldrug")
    public List<DrugInfo> findDrug(){
        return drugSystemService.queryDrug();
    }

    /**
     * 2020.12.28 陈泉润
     * @param druginfoVO
     * @return 药品信息模糊查询
     */
    @RequestMapping("/likedrug")
    public List<DrugInfo> likeFindDrug(DruginfoVO druginfoVO){
        return drugSystemService.queryDrugLike(druginfoVO);
    }
}
