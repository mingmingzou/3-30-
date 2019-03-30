package com.qianfeng.fxmall.goods.dao;

import com.qianfeng.fxmall.goods.bean.WxbGoodSku;

import java.util.List;

public interface GoodSkuDAO {
     List<WxbGoodSku> queryGoodSkuByPage(Integer page);
}
