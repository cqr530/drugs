package com.lianxi.drugs.dao;

import com.lianxi.drugs.dto.TuiHuoDanDto;
import com.lianxi.drugs.pojo.CreditOrder;
import com.lianxi.drugs.vo.CreditOrderVO;
import com.lianxi.drugs.vo.TuiHuoDanVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CreditOrderMapper {
    /*查询*/
    List<CreditOrder> queryAllTuiHuoDanPage(TuiHuoDanDto tuiHuoDanDto);

    long queryAllTuiHuoDanCount(TuiHuoDanDto tuiHuoDanDto);

    //创建退货单
    Integer insertTuiHuoDanDto(TuiHuoDanDto tuiHuoDanDto);

    //查询所有退货单
    List<CreditOrderVO> selectAllCreditOrder();
    //退货
    Integer updateCreditOrder(@Param("list") Integer[] list);

    TuiHuoDanVo queryTuiHuoDanById(Integer id);

    Integer todeleteTuiHuoDan(Integer id);
}