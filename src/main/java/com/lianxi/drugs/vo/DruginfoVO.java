package com.lianxi.drugs.vo;

import lombok.Data;

@Data
public class DruginfoVO {
    private String serialNum;

    private String genericName;

    private String reagentType;

    private String drugSize;

    private String company;

    private Integer transverNum;

    private String factoryName;

    private String productName;

    private float max;

    private float min;

    private String qualityLevel;

    private String drugType;

    private Integer drugTranlStatus;
}
