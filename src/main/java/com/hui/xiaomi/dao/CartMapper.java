package com.hui.xiaomi.dao;

import com.hui.xiaomi.pojo.Cart;
import com.hui.xiaomi.pojo.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartMapper {
    List<Cart> selectCartGoods();
    int joinCartGoods(@Param("cartNum") Integer cartNum,@Param("customerId") Integer customerId,@Param("goods") Goods goods);
    int updateCartGoodsNum(@Param("cartNum") Integer cartNum,@Param("customerId") Integer customerId ,@Param("goods") Goods goods);
    int deleteBatchCartGoods(Integer[] cartId);
    List<Cart> selectCartGoodsById(Integer customerId);
    List<Cart> selectCartGoodsPageList(Integer customerId);
}
