package com.hui.xiaomi.dao;

import com.hui.xiaomi.pojo.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface GoodMapper {
    List<Goods> selectAllGoods();
    int insertGoods(Goods goods);
    int deleteGoods(Integer goodsId);
    int updateGoods(Goods goods);
    List<Goods> selectGoodsByLike(@Param("columns") String columns,@Param("filed") String filed);
    List<Goods> selectGoodsKeyword(String keyword);
    List<Goods> selectGoodsByPrice(Map map);
    int insertBatchGoods(List<Goods> list);
    List<Goods> selectBatchGoods(Integer[] goods);
    int deleteBatchGoods(Integer[] goodsId);
    int updatePartGoods(Goods goods);
    Goods selectGoodsInfo(Integer goodsId);
    List<Goods> selectAllGoodsPage();
}
