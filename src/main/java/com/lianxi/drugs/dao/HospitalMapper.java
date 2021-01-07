package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.Hospital;

public interface HospitalMapper {
    int deleteByPrimaryKey(Integer hospitalId);

    int insert(Hospital record);

    int insertSelective(Hospital record);

    Hospital selectByPrimaryKey(Integer hospitalId);

    int updateByPrimaryKeySelective(Hospital record);

    int updateByPrimaryKey(Hospital record);
}