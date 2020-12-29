package com.lianxi.drugs.pojo;

public class OrderlistInfo {
    private Integer id;

    private Integer orderId;

    private Integer drugId;

    private Integer supplierId;

    private Float orderBiddingprice;

    private Float orderTradingprice;

    private Integer orderBuycount;

    private Float orderBuyprice;

    private Integer orderBuystate;

    private Integer orderState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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

    public Float getOrderBiddingprice() {
        return orderBiddingprice;
    }

    public void setOrderBiddingprice(Float orderBiddingprice) {
        this.orderBiddingprice = orderBiddingprice;
    }

    public Float getOrderTradingprice() {
        return orderTradingprice;
    }

    public void setOrderTradingprice(Float orderTradingprice) {
        this.orderTradingprice = orderTradingprice;
    }

    public Integer getOrderBuycount() {
        return orderBuycount;
    }

    public void setOrderBuycount(Integer orderBuycount) {
        this.orderBuycount = orderBuycount;
    }

    public Float getOrderBuyprice() {
        return orderBuyprice;
    }

    public void setOrderBuyprice(Float orderBuyprice) {
        this.orderBuyprice = orderBuyprice;
    }

    public Integer getOrderBuystate() {
        return orderBuystate;
    }

    public void setOrderBuystate(Integer orderBuystate) {
        this.orderBuystate = orderBuystate;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }
}