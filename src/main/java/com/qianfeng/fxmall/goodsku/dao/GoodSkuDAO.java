package com.qianfeng.fxmall.goodsku.dao;

import com.qianfeng.fxmall.goodsku.bean.WxbGoodSku;

import java.util.List;

public interface GoodSkuDAO {
     List<WxbGoodSku> queryGoodSkuByPage(Integer page);
     void addGoodSku(WxbGoodSku wxbGoodSku);
     void  deleteGoodSku(String skuId);
     void updateGoodSku(WxbGoodSku wxbGoodSku);
}
