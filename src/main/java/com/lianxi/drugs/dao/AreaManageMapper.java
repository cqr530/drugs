package com.lianxi.drugs.dao;

import com.lianxi.drugs.pojo.AreaManage;

public interface AreaManageMapper {
    int deleteByPrimaryKey(Integer areaId);

    int insert(AreaManage record);

    int insertSelective(AreaManage record);

    AreaManage selectByPrimaryKey(Integer areaId);

    int updateByPrimaryKeySelective(AreaManage record);

    int updateByPrimaryKey(AreaManage record);
}