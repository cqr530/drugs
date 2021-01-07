package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.User;
import org.apache.ibatis.annotations.Param;
public interface UserMapper {

    User selectuser(@Param("name") String name, @Param("pwd") String pwd);

    /*查询前台传入的用户名数据库是否存在*/
    User selectuserByName(String name);












































    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);


}