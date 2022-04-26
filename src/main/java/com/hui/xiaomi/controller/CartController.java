package com.hui.xiaomi.controller;

import com.github.pagehelper.PageInfo;
import com.hui.xiaomi.pojo.Cart;
import com.hui.xiaomi.pojo.Goods;
import com.hui.xiaomi.service.CartService;
import com.hui.xiaomi.vo.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/action")
public class CartController {
    @Resource
    CartService cartService;
    @RequestMapping("/selectCartGoods")
    public Result selectCartGoods(){
        List<Cart> carts = cartService.selectCartGoods();
        return new Result(true,"查询成功",carts);
    }
    @RequestMapping("/joinCartGoods")
    public Result joinCartGoods(@RequestParam(defaultValue = "1") String cartNum,Integer customerId, Goods goods){

        int rows = cartService.joinCartGoods(Integer.valueOf(cartNum), customerId,goods);
        if (rows!=0){
            return new Result(true,"添加购物车成功");
        }
        return new Result(false,"添加购物车失败");
    }
    @RequestMapping("/deleteBatchCartGoods")
    public Result deleteBatchCartGoods(@RequestBody Integer[] cartId){
        int rows = cartService.deleteBatchCartGoods(cartId);
        if (rows!=0){
            return new Result(true,"删除成功");
        }
        return new Result(false,"删除失败");
    }
    @RequestMapping("/selectCartGoodsById")
    public Result selectCartGoodsById(Integer customerId){
        List<Cart> carts = cartService.selectCartGoodsById(customerId);
        return new Result(true,"查询成功",carts);
    }
    @RequestMapping("/updateCartGoodsNum")
    public Result updateCartGoodsNum(Integer cartNum,Integer customerId,Goods goods){
        int rows = cartService.updateCartGoodsNum(cartNum, customerId, goods);
        return new Result(true,"更改成功");
    }
    @RequestMapping("/selectCartGoodsPageList")
    public Result selectCartGoodsPageList(Integer customerId,@RequestParam(defaultValue = "1") Integer pageNum,@RequestParam(defaultValue = "2") Integer pageSize){
        PageInfo<Cart> pageInfo = cartService.selectCartGoodsPageList(customerId, pageNum, pageSize);
        return new Result(true,"分页查询购物车成功",pageInfo);
    }
}
