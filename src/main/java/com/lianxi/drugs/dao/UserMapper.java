package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.User;
import org.apache.ibatis.annotations.Param;
public interface UserMapper {

    Integer selectuser(@Param("name")String name, @Param("pwd") String pwd);














































    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);


}