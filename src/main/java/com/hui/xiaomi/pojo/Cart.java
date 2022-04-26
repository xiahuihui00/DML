package com.hui.xiaomi.pojo;
public class Cart {
    private Integer cartId;
    private Integer cartNum;
    private String goodsName;
    private Double goodsPrice;
    private String goodsInfo;
    private Integer goodsId;
    private Integer customerId;

    public Cart() {
    }

    public Cart(Integer cartNum, String goodsName, Double goodsPrice, String goodsInfo, Integer goodsId, Integer customerId) {
        this.cartNum = cartNum;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsInfo = goodsInfo;
        this.goodsId = goodsId;
        this.customerId = customerId;
    }

    public Cart(Integer cartId, Integer cartNum, String goodsName, Double goodsPrice, String goodsInfo, Integer goodsId, Integer customerId) {
        this.cartId = cartId;
        this.cartNum = cartNum;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsInfo = goodsInfo;
        this.goodsId = goodsId;
        this.customerId = customerId;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getCartNum() {
        return cartNum;
    }

    public void setCartNum(Integer cartNum) {
        this.cartNum = cartNum;
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

    public String getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartId=" + cartId +
                ", cartNum=" + cartNum +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsInfo='" + goodsInfo + '\'' +
                ", goodsId=" + goodsId +
                ", customerId=" + customerId +
                '}';
    }
}
