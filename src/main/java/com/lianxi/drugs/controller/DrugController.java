package com.lianxi.drugs.controller;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.lianxi.drugs.common.ServerResponse;
import com.lianxi.drugs.pojo.*;
import com.lianxi.drugs.service.DrugIndexService;
import com.lianxi.drugs.service.SupplierService;
import com.lianxi.drugs.service.UserService;
import com.lianxi.drugs.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
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
    @Autowired
    private SupplierService supplierService;
    @Autowired
    DefaultKaptcha defaultKaptcha;
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
            Integer userCompany = user.getUserCompany();

            List<DrugDirectory> list = new ArrayList<>();

            for (int i = 0; i < idArr.length; i++) {
                DrugDirectory drugDirectory = new DrugDirectory();
                drugDirectory.setDrugId(idArr[i]);
                drugDirectory.setHospitalId(userCompany);
                list.add(drugDirectory);
            }

            Integer code = drugIndexService.insertDrugToHospital(list);
            if (code > 0) {
                return ServerResponse.success(code);
            }
            return ServerResponse.error();
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }

    /**
     * 2021.1.7     zmh
     * @return 将药品信息添加到医院的药品目录
     */
    @RequestMapping("/deleteDrugToHospital")
    public ServerResponse deleteDrugToHospital(@RequestParam(value = "idArr[]")int[] idArr) {

        try {
            Integer code = drugIndexService.deleteDrugToHospital(idArr);
            if (code > 0) {
                return ServerResponse.success(code);
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

    /**
     * 2021.1.11 陈泉润
     * @param
     * @return添加供货药品
     */
    @RequestMapping("/adddrugs")
    public Integer adddrugs(@RequestParam("list[]") Integer[] list){
        return supplierService.saveDrugs(list);
    }


    /**
     * 2021.1.11 陈泉润
     * @param httpServletRequest
     * @param httpServletResponse
     * @throws Exception
     * 获取验证码
     */
    @RequestMapping("/getCode")
    public void defaultKaptcha(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception{
        byte[] captchaChallengeAsJpeg = null;
        ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();
        try {
            //生产验证码字符串并保存到session中
            String createText = defaultKaptcha.createText();
            httpServletRequest.getSession().setAttribute("vrifyCode", createText);
            //使用生产的验证码字符串返回一个BufferedImage对象并转为byte写入到byte数组中
            BufferedImage challenge = defaultKaptcha.createImage(createText);
            ImageIO.write(challenge, "jpg", jpegOutputStream);
        } catch (IllegalArgumentException e) {
            httpServletResponse.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
        //定义response输出类型为image/jpeg类型，使用response输出流输出图片的byte数组
        captchaChallengeAsJpeg = jpegOutputStream.toByteArray();
        httpServletResponse.setHeader("Cache-Control", "no-store");
        httpServletResponse.setHeader("Pragma", "no-cache");
        httpServletResponse.setDateHeader("Expires", 0);
        httpServletResponse.setContentType("image/jpeg");
        ServletOutputStream responseOutputStream =
                httpServletResponse.getOutputStream();
        responseOutputStream.write(captchaChallengeAsJpeg);
        responseOutputStream.flush();
        responseOutputStream.close();
    }

    /**
     * 2021.1.11 陈泉润
     * @param httpServletRequest
     * @param httpServletResponse
     * @return 验证码验证
     */
    @RequestMapping("/checkCode")
    @ResponseBody
    public boolean imgvrifyControllerDefaultKaptcha(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        String captchaId = (String) httpServletRequest.getSession().getAttribute("vrifyCode");
        String parameter = httpServletRequest.getParameter("code");
        System.out.println("Session  vrifyCode ---->"+captchaId+"---- form code --->"+parameter);
        if (!captchaId.equals(parameter)) {
            System.out.println("错误的验证码");
            return false;
        } else {
            return true;
        }
    }
}
