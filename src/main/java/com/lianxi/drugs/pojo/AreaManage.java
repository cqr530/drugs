package com.lianxi.drugs.pojo;

public class AreaManage {
    private Integer areaId;

    private String areaName;

    private String areaLev;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getAreaLev() {
        return areaLev;
    }

    public void setAreaLev(String areaLev) {
        this.areaLev = areaLev == null ? null : areaLev.trim();
    }
}