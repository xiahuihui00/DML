package com.hui.xiaomi.service;

import com.github.pagehelper.PageInfo;
import com.hui.xiaomi.pojo.Cart;
import com.hui.xiaomi.pojo.Goods;

import java.util.List;

public interface CartService {
    List<Cart> selectCartGoods();
    int joinCartGoods(Integer cartNum, Integer customerId,Goods goods);
    int deleteBatchCartGoods(Integer[] cartId);
    List<Cart> selectCartGoodsById(Integer customerId);
    int updateCartGoodsNum(Integer cartNum,Integer customer,Goods goods);
    PageInfo<Cart> selectCartGoodsPageList(Integer customerId,Integer pageNum,Integer pageSize);
}
