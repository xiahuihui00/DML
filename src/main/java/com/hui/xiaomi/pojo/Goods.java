package com.hui.xiaomi.pojo;

public class Goods {
    private Integer goodsId;
    private String goodsName;
    private Double goodsPrice;
    private Integer goodsNumber;
    private String GoodsInfo;

    public Goods() {
    }

    public Goods(String goodsName, Double goodsPrice, Integer goodsNumber, String goodsInfo) {
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsNumber = goodsNumber;
        GoodsInfo = goodsInfo;
    }

    public Goods(Integer goodsId, String goodsName, Double goodsPrice, Integer goodsNumber, String goodsInfo) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsNumber = goodsNumber;
        GoodsInfo = goodsInfo;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
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

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public String getGoodsInfo() {
        return GoodsInfo;
    }

    public void setGoodsInfo(String goodsInfo) {
        GoodsInfo = goodsInfo;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsNumber=" + goodsNumber +
                ", GoodsInfo='" + GoodsInfo + '\'' +
                '}';
    }
}
