package com.qianfeng.fxmall.goods.service.Impl;

import com.qianfeng.fxmall.goods.bean.WxbGoodSku;
import com.qianfeng.fxmall.goods.dao.GoodSkuDAO;
import com.qianfeng.fxmall.goods.dao.Impl.GoodSkuDAOImpl;
import com.qianfeng.fxmall.goods.service.GoodSkuService;

import java.util.List;

public class GoodSkuServiceImpl implements GoodSkuService {
     GoodSkuDAO goodSkuDAO=new GoodSkuDAOImpl();
    @Override
    public List<WxbGoodSku> queryGoodSkuByPage(Integer page) {
        goodSkuDAO.queryGoodSkuByPage(page);
        return null;
    }
}
