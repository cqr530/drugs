package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.User;
import org.apache.ibatis.annotations.Param;
public interface UserMapper {
    //登录
    Integer selectuser(@Param("name")String name, @Param("pwd") String pwd);
}