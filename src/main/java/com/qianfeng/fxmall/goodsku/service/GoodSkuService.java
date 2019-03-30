package com.qianfeng.fxmall.goodsku.service;

import com.qianfeng.fxmall.goodsku.bean.WxbGoodSku;

import java.util.List;

public interface GoodSkuService {
    List<WxbGoodSku> queryGoodSkuByPage(Integer page);
}
