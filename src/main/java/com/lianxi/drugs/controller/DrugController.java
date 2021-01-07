package com.lianxi.drugs.controller;

import com.lianxi.drugs.common.ServerResponse;
import com.lianxi.drugs.pojo.DrugClazz;
import com.lianxi.drugs.pojo.DrugInfo;
import com.lianxi.drugs.pojo.Item;
import com.lianxi.drugs.pojo.User;
import com.lianxi.drugs.service.DrugIndexService;
import com.lianxi.drugs.service.UserService;
import com.lianxi.drugs.vo.CreditOrderVO;
import com.lianxi.drugs.vo.DruginfoVO;
import com.lianxi.drugs.vo.ItemVO;
import com.lianxi.drugs.vo.OrderVO;
import com.lianxi.drugs.pojo.OrderForm;
import com.lianxi.drugs.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/drugs")
public class DrugController {
    @Autowired
    private com.lianxi.drugs.service.DrugSystemService drugSystemService;

    @Autowired
    private UserService userService;
    @Autowired
    private DrugIndexService drugIndexService;
    @Autowired
    private HttpServletRequest request;

    /**
     *2020.12.24 陈泉润
     * @param name
     * @param pwd
     * @return 登录接口
     */
    @RequestMapping("/denglu")
    public ServerResponse findUser(@RequestParam("name")String name, @RequestParam("pwd") String pwd,HttpSession session){
        try {
                User user = userService.queryUserByName(name);
                if(user!=null){
                if(user.getUserPwd().equals(pwd)){
                    session.setAttribute("user",user);
                    return ServerResponse.success();
                }
            }
            return ServerResponse.error();
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
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

    /**
     * 2020.12.30 陈泉润
     * @return 查询所有订单
     */
    @RequestMapping("/orders")
    public List<OrderVO> findOrders(){
        return drugSystemService.queryAllOrder();
    }

    /**
     * 2021.1.5 陈泉润
     * @return 查询所有退货单
     */
    @RequestMapping("/creditorders")
    public List<CreditOrderVO> findCreditOrders(){
        return drugSystemService.queryAllCreditOrder();
    }

    /**
     * 2021.1.6     zmh
     * @return 将药品信息添加到医院的药品目录
     */
    @RequestMapping("/insertDrugToHospital")
    public ServerResponse insertDrugToHospital(@RequestParam(value = "idArr[]")int[] idArr) {

        try {
            HttpSession session1 = request.getSession();
            User user = (User) session1.getAttribute("user");
            Integer userId = user.getUserId();
            Integer code = drugIndexService.insertDrugToHospital(userId, idArr);
            if (code > 0) {
                return ServerResponse.success();
            }
            return ServerResponse.error();
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }
     /**
     * 2021.1.6 陈泉润
     * @return 查询所有结算单
     */
    @RequestMapping("/payofftab")
    public List<PayoffTabVO> findPayoffTab(){
        return drugSystemService.queryAllPayoffTab();
    }
    /**
     * 2021.1.6 陈泉润
     * @return 按采购单查询所有
     */
    @RequestMapping("/orderinfo")
    public List<OrderlistVO> findOrderlistInfo(){
        return drugSystemService.queryAllOrderlistInfo();
    }
}
