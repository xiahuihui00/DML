package com.hui.xiaomi.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hui.xiaomi.dao.CartMapper;
import com.hui.xiaomi.pojo.Cart;
import com.hui.xiaomi.pojo.Goods;
import com.hui.xiaomi.service.CartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Resource
    CartMapper cartMapper;
    @Override
    public List<Cart> selectCartGoods() {
        List<Cart> carts = cartMapper.selectCartGoods();
        return carts;
    }

    @Override
    public int joinCartGoods(Integer cartNum,Integer customerId ,Goods goods) {
        List<Cart> carts = cartMapper.selectCartGoods();
        for (Cart cart:carts){
            if (cart.getGoodsId()==goods.getGoodsId()&&customerId==cart.getCustomerId()){
                cartNum += cart.getCartNum();
                int rows =cartMapper.updateCartGoodsNum(cartNum,customerId, goods);
                return rows;
            }
        }
        int lows = cartMapper.joinCartGoods(cartNum, customerId,goods);
        return lows;
    }

    @Override
    public int deleteBatchCartGoods(Integer[] cartId) {
        int rows = cartMapper.deleteBatchCartGoods(cartId);
        return rows;
    }

    @Override
    public List<Cart> selectCartGoodsById(Integer cstomerId) {
        List<Cart> carts = cartMapper.selectCartGoodsById(cstomerId);
        return carts;
    }

    @Override
    public int updateCartGoodsNum(Integer cartNum, Integer customer, Goods goods) {
        int rows = cartMapper.updateCartGoodsNum(cartNum, customer, goods);
        return rows;
    }

    @Override
    public PageInfo<Cart> selectCartGoodsPageList(Integer customerId,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Cart> carts = cartMapper.selectCartGoodsPageList(customerId);
        PageInfo<Cart> pageInfo = new PageInfo<>(carts);
        return pageInfo;
    }
}
