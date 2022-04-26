package com.hui.xiaomi.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hui.xiaomi.dao.GoodMapper;
import com.hui.xiaomi.pojo.Goods;
import com.hui.xiaomi.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    GoodMapper goodMapper;
    @Override
    public List<Goods> selectAllGoods() {
        List<Goods> goods = goodMapper.selectAllGoods();
        return goods;
    }

    @Override
    public int insertGoods(Goods goods) {
        int rows = goodMapper.insertGoods(goods);
        return rows;
    }

    @Override
    public int deleteGoods(Integer goodsId) {
        int rows = goodMapper.deleteGoods(goodsId);
        return rows;
    }

    @Override
    public int updateGoods(Goods goods) {
        int rows = goodMapper.updateGoods(goods);
        return rows;
    }

    @Override
    public List<Goods> selectGoodsByLike(String columns,String value) {
        List<Goods> goods = goodMapper.selectGoodsByLike(columns, value);
        return goods;
    }

    @Override
    public List<Goods> selectGoodsKeyword(String keyword) {
        List<Goods> goods = goodMapper.selectGoodsKeyword(keyword);
        return goods;
    }

    @Override
    public List<Goods> selectGoodsPrice(Double beginPrice,Double endPrice) {
        Map map = new HashMap();
        map.put("beginPrice", beginPrice);
        map.put("endPrice",endPrice);
        List<Goods> goods = goodMapper.selectGoodsByPrice(map);
        return goods;
    }

    @Override
    public int insertBatchGoods(List<Goods> list) {
        int rows = goodMapper.insertBatchGoods(list);
        return rows;
    }

    @Override
    public List<Goods> selectBatchGoods(Integer[] goods) {
        List<Goods> list = goodMapper.selectBatchGoods(goods);
        return list;
    }

    @Override
    public int deleteBatchGoods(Integer[] goodsId) {
        int rows = goodMapper.deleteBatchGoods(goodsId);
        return rows;
    }

    @Override
    public int updatePartGoods(Goods goods) {
        int rows = goodMapper.updatePartGoods(goods);
        return rows;
    }

    @Override
    public Goods selectGoodsInfo(Integer goodsId) {
        Goods goods = goodMapper.selectGoodsInfo(goodsId);
        return goods;
    }

    @Override
    public PageInfo<Goods> selectAllGoodsPage(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Goods> goods = goodMapper.selectAllGoodsPage();
        PageInfo<Goods> pageInfo = new PageInfo<>(goods);
        return pageInfo;
    }

}
