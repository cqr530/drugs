package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.OrderForm;
import com.lianxi.drugs.vo.OrderVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderFormMapper {
    //查询所有订单
    List<OrderVO> selectAllOrder();
    //发货
    Integer updateOrder(@Param("list") Integer[] list);
}