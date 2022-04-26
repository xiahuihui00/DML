package com.hui.xiaomi.controller;

import com.github.pagehelper.PageInfo;
import com.hui.xiaomi.pojo.Goods;
import com.hui.xiaomi.service.GoodsService;
import com.hui.xiaomi.vo.Result;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/action")
public class GoodsController {
    @Resource
    GoodsService goodsService;
    @RequestMapping("/selectAllGoods")
    public List<Goods> selectAllGoods(){
        List<Goods> goods = goodsService.selectAllGoods();
        return goods;
    }
    @RequestMapping("/insertGoods")
    public String insertGoods(Goods goods){
        int rows = goodsService.insertGoods(goods);
        if(rows!=0){
            return "插入成功";
        }
        return "插入失败";
    }
    @RequestMapping("/deleteGoods")
    public String deleteGoods(Integer goodsId){
        int rows = goodsService.deleteGoods(goodsId);
        if(rows!=0){
            return "删除成功";
        }
        return "删除失败";
    }
    @RequestMapping("/updateGoods")
    public String updateGoods(Goods goods){
        int rows = goodsService.updateGoods(goods);
        if(rows!=0){
            return "更新成功";
        }
        return "更新失败";
    }
    @RequestMapping("/selectGoodsByLike")
    public List<Goods> selectGoodsByLike(String columns,String value){
        List<Goods> goods = goodsService.selectGoodsByLike(columns, value);
        return goods;
    }
    @RequestMapping("/selectGoodsKeyword")
    public List<Goods> selectGoodsKeyword(String keyword){
        List<Goods> goods = goodsService.selectGoodsKeyword(keyword);
        return goods;
    }
    @RequestMapping("/selectGoodsPrice")
    public List<Goods> selectGoodsPrice(String beginPrice,String endPrice){
        List<Goods> goods = goodsService.selectGoodsPrice(Double.valueOf(beginPrice), Double.valueOf(endPrice));
        return goods;
    }
    @RequestMapping("/insertBatchGoods")
    public String insertBatchGoods(@RequestBody List<Goods> list){
        int rows = goodsService.insertBatchGoods(list);
        if(rows!=0){
            return "批量插入成功";
        }
        return "批量插入失败";
    }
    @RequestMapping("/selectBatchGoods")
    public List<Goods> selectBatchGoods(@RequestBody Integer[] goodsId){
        List<Goods> goods = goodsService.selectBatchGoods(goodsId);
        return goods;
    }
    @RequestMapping("/deleteBatchGoods")
    public String deleteBatchGoods(@RequestBody Integer[] goodsId){
        int rows = goodsService.deleteBatchGoods(goodsId);
        if(rows!=0){
            return "批量删除成功";
        }
        return "批量删除失败";
    }
    @RequestMapping("/updatePartGoods")
    public String updatePartGoods(Goods goods){
        int rows = goodsService.updatePartGoods(goods);
        if(rows!=0){
            return "更新成功";
        }
        return "更新失败";
    }
    @RequestMapping("/selectGoodsInfo")
    public Goods selectGoodsInfo(Integer goodsId){
        Goods goods = goodsService.selectGoodsInfo(goodsId);
        return goods;
    }
    @RequestMapping("/selectAllGoodsPage")
    public Result selectAllGoodsPage(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "5") Integer pageSize){
        PageInfo<Goods> pageInfo = goodsService.selectAllGoodsPage(pageNum, pageSize);
        return new Result(true,"分页查询成功",pageInfo);
    }

}
