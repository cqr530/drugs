package com.lianxi.drugs.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PurchaseDrug {
    private Integer id;

    private Integer orderNum;

    private Integer drugId;

    private Integer supplierId;

    private BigDecimal orderBiddingprice;

    private BigDecimal orderTradingprice;

    private Integer orderBuycount;

    private BigDecimal orderBuyprice;

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public BigDecimal getOrderBiddingprice() {
        return orderBiddingprice;
    }

    public void setOrderBiddingprice(BigDecimal orderBiddingprice) {
        this.orderBiddingprice = orderBiddingprice;
    }

    public BigDecimal getOrderTradingprice() {
        return orderTradingprice;
    }

    public void setOrderTradingprice(BigDecimal orderTradingprice) {
        this.orderTradingprice = orderTradingprice;
    }

    public Integer getOrderBuycount() {
        return orderBuycount;
    }

    public void setOrderBuycount(Integer orderBuycount) {
        this.orderBuycount = orderBuycount;
    }

    public BigDecimal getOrderBuyprice() {
        return orderBuyprice;
    }

    public void setOrderBuyprice(BigDecimal orderBuyprice) {
        this.orderBuyprice = orderBuyprice;
    }
}