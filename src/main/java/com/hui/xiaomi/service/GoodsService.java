package com.hui.xiaomi.service;

import com.github.pagehelper.PageInfo;
import com.hui.xiaomi.pojo.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> selectAllGoods();
    int insertGoods(Goods goods);
    int deleteGoods(Integer goodsId);
    int updateGoods(Goods goods);
    List<Goods> selectGoodsByLike(String columns,String value);
    List<Goods> selectGoodsKeyword(String keyword);
    List<Goods> selectGoodsPrice(Double beginPrice,Double endPrice);
    int insertBatchGoods(List<Goods> list);
    List<Goods> selectBatchGoods(Integer[] goods);
    int deleteBatchGoods(Integer[] goodsId);
    int updatePartGoods(Goods goods);
    Goods selectGoodsInfo(Integer goodsId);
    PageInfo<Goods> selectAllGoodsPage(Integer pageNum, Integer pageSize);

}
