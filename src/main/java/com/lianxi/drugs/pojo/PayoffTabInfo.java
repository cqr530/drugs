package com.lianxi.drugs.pojo;

public class PayoffTabInfo {
    private Integer id;

    private Integer drugInfoId;

    private Integer payoffTabId;

    private Integer payoffCount;

    private Float payoffPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDrugInfoId() {
        return drugInfoId;
    }

    public void setDrugInfoId(Integer drugInfoId) {
        this.drugInfoId = drugInfoId;
    }

    public Integer getPayoffTabId() {
        return payoffTabId;
    }

    public void setPayoffTabId(Integer payoffTabId) {
        this.payoffTabId = payoffTabId;
    }

    public Integer getPayoffCount() {
        return payoffCount;
    }

    public void setPayoffCount(Integer payoffCount) {
        this.payoffCount = payoffCount;
    }

    public Float getPayoffPrice() {
        return payoffPrice;
    }

    public void setPayoffPrice(Float payoffPrice) {
        this.payoffPrice = payoffPrice;
    }
}