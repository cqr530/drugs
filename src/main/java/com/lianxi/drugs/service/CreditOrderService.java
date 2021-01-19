package com.lianxi.drugs.service;

import com.lianxi.drugs.dto.TuiHuoDanDto;
import com.lianxi.drugs.pojo.CreditOrderInfo;

import java.util.List;

public interface CreditOrderService {
    Integer insertTuiHuoDanDto(TuiHuoDanDto tuiHuoDanDto);

    Integer todeleteTuiHuoDan(Integer id);

    Integer addDrugToTuiHuoDan(List<CreditOrderInfo> list);
}
