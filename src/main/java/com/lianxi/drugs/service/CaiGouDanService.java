package com.lianxi.drugs.service;

import com.lianxi.drugs.dto.CaiGouDanDto;

public interface CaiGouDanService {
    int createCaiGouDan(CaiGouDanDto caiGouDanDto);

    Integer toDeleteCaiGouDan(Integer id);
}
