package com.lianxi.drugs.service;

import com.lianxi.drugs.pojo.DrugDirectory;

import java.util.List;

public interface DrugIndexService {

    Integer insertDrugToHospital(List<DrugDirectory> list);

    Integer deleteDrugToHospital(int[] idArr);

}
