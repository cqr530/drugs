package com.lianxi.drugs.service.impl;

import com.lianxi.drugs.dao.UserMapper;
import com.lianxi.drugs.pojo.User;
import com.lianxi.drugs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserByName(String name) {
        return userMapper.selectuserByName(name);
    }
}
