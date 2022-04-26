package com.hui.xiaomi.pojo;

import java.util.Date;

public class Order {
    private String order_id;
    private String goodsName;
    private Double goodsPrice;
    private Integer cartNum;
    private Date orderTime;
    private Double orderMoney;
    private Integer customerId;
    private Integer goodsId;

    public Order() {
    }

    public Order(String goodsName, Double goodsPrice, Integer cartNum, Date orderTime, Double orderMoney, Integer customerId, Integer goodsId) {
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.cartNum = cartNum;
        this.orderTime = orderTime;
        this.orderMoney = orderMoney;
        this.customerId = customerId;
        this.goodsId = goodsId;
    }

    public Order(String order_id, String goodsName, Double goodsPrice, Integer cartNum, Date orderTime, Double orderMoney, Integer customerId, Integer goodsId) {
        this.order_id = order_id;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.cartNum = cartNum;
        this.orderTime = orderTime;
        this.orderMoney = orderMoney;
        this.customerId = customerId;
        this.goodsId = goodsId;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getCartNum() {
        return cartNum;
    }

    public void setCartNum(Integer cartNum) {
        this.cartNum = cartNum;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Double getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(Double orderMoney) {
        this.orderMoney = orderMoney;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id='" + order_id + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", cartNum=" + cartNum +
                ", orderTime=" + orderTime +
                ", orderMoney=" + orderMoney +
                ", customerId=" + customerId +
                ", goodsId=" + goodsId +
                '}';
    }
}
