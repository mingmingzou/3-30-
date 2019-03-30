package com.qianfeng.fxmall.goods.mapper.Goods;

import com.qianfeng.fxmall.goods.bean.WxbGood;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {
    List<WxbGood> queryGoodByPage(@Param("index") Integer index, @Param("size") Integer size);
    void  addGoods(WxbGood wxbGood);
    void deleteGoods(@Param("goodId") String goodId);
    void updateGoods(WxbGood wxbGood);
}

