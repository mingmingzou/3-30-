package com.qianfeng.fxmall.goods.service;

import com.qianfeng.fxmall.goods.bean.WxbGoodSku;

import java.util.List;

public interface GoodSkuService {
    List<WxbGoodSku> queryGoodSkuByPage(Integer page);
}
