package com.qianfeng.fxmall.goodsku.service.Impl;

import com.qianfeng.fxmall.goodsku.bean.WxbGoodSku;
import com.qianfeng.fxmall.goodsku.dao.GoodSkuDAO;
import com.qianfeng.fxmall.goodsku.dao.Impl.GoodSkuDAOImpl;
import com.qianfeng.fxmall.goodsku.service.GoodSkuService;

import java.util.List;

public class GoodSkuServiceImpl implements GoodSkuService {
     GoodSkuDAO goodSkuDAO=new GoodSkuDAOImpl();
    @Override
    public List<WxbGoodSku> queryGoodSkuByPage(Integer page) {
        goodSkuDAO.queryGoodSkuByPage(page);
        return null;
    }
}
