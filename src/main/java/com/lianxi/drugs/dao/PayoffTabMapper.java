package com.lianxi.drugs.dao;

import com.lianxi.drugs.dto.JieSuanDanDto;
import com.lianxi.drugs.pojo.PayoffTab;
import com.lianxi.drugs.pojo.PayoffTabInfo;
import com.lianxi.drugs.vo.JieSuanDanVo;
import com.lianxi.drugs.vo.PayoffTabVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PayoffTabMapper {
    //查询所有结算单
    List<PayoffTabVO> selectAllPayoffTab();
    //结算
    Integer updatePayoffTab(@Param("list") Integer[] list);


    /*创建结算单*/
    Integer createJieSuanDan(PayoffTab payoffTab);

    List<JieSuanDanVo> queryAllJieSuanDanPage(JieSuanDanDto jieSuanDanDto);

    long queryAllJieSuanDanCount(JieSuanDanDto jieSuanDanDto);

    JieSuanDanVo queryJieSuanDanById(Integer id);

    Integer addDrugToJieSuanDanInfo(List<PayoffTabInfo> list);
}