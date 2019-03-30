package com.qianfeng.fxmall.goods.dao.Impl;

import com.qianfeng.fxmall.commons.info.SystemCU;
import com.qianfeng.fxmall.commons.mybatis.MybatixSessionFU;
import com.qianfeng.fxmall.goods.bean.WxbGoodSku;
import com.qianfeng.fxmall.goods.dao.GoodSkuDAO;
import com.qianfeng.fxmall.goods.dao.GoodsDAO;
import com.qianfeng.fxmall.goods.mapper.Goods.GoodSkuMapper;

import java.util.List;

public class GoodSkuDAOImpl implements GoodSkuDAO {
    @Override
    public List<WxbGoodSku> queryGoodSkuByPage(Integer page) {
        GoodSkuMapper goodSkuMapper= MybatixSessionFU.getSession().getMapper(GoodSkuMapper.class);
        List<WxbGoodSku> wxbGoodSkuList=goodSkuMapper.queryGoodSkuByPage(page, SystemCU.page.PAGE_SIZE);
        return wxbGoodSkuList;
    }
}
