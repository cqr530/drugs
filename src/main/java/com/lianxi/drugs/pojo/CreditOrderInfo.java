package com.lianxi.drugs.pojo;

public class CreditOrderInfo {
    private Integer coiId;

    private Integer orId;

    private Integer drugId;

    private Integer coId;

    private Integer coiRate;

    private Integer coiMoney;

    private Integer coiState;

    private String coiReason;

    public Integer getCoiId() {
        return coiId;
    }

    public void setCoiId(Integer coiId) {
        this.coiId = coiId;
    }

    public Integer getOrId() {
        return orId;
    }

    public void setOrId(Integer orId) {
        this.orId = orId;
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public Integer getCoId() {
        return coId;
    }

    public void setCoId(Integer coId) {
        this.coId = coId;
    }

    public Integer getCoiRate() {
        return coiRate;
    }

    public void setCoiRate(Integer coiRate) {
        this.coiRate = coiRate;
    }

    public Integer getCoiMoney() {
        return coiMoney;
    }

    public void setCoiMoney(Integer coiMoney) {
        this.coiMoney = coiMoney;
    }

    public Integer getCoiState() {
        return coiState;
    }

    public void setCoiState(Integer coiState) {
        this.coiState = coiState;
    }

    public String getCoiReason() {
        return coiReason;
    }

    public void setCoiReason(String coiReason) {
        this.coiReason = coiReason == null ? null : coiReason.trim();
    }
}