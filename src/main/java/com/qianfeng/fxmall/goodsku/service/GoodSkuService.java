package com.qianfeng.fxmall.goodsku.service;

import com.qianfeng.fxmall.goodsku.bean.WxbGoodSku;

import java.util.List;

public interface GoodSkuService {
    void addGoodSku(WxbGoodSku wxbGoodSku);
    List<WxbGoodSku> queryGoodSkuByPage(Integer page);
    void deleteGoodSku(String skuId);
    void updateGoodSku(WxbGoodSku wxbGoodSku);
}
