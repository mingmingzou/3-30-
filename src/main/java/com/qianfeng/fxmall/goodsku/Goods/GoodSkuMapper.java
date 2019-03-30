package com.qianfeng.fxmall.goodsku.Goods;

import com.qianfeng.fxmall.goodsku.bean.WxbGoodSku;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodSkuMapper {
    List<WxbGoodSku>  queryGoodSkuByPage(@Param("page") Integer page, @Param("size") Integer size);
}
