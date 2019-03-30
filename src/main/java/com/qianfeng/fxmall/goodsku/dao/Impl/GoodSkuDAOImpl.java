package com.qianfeng.fxmall.goodsku.dao.Impl;

import com.qianfeng.fxmall.commons.info.SystemCU;
import com.qianfeng.fxmall.commons.mybatis.MybatixSessionFU;
import com.qianfeng.fxmall.goodsku.Goods.GoodSkuMapper;
import com.qianfeng.fxmall.goodsku.bean.WxbGoodSku;
import com.qianfeng.fxmall.goodsku.dao.GoodSkuDAO;

import java.util.List;

public class GoodSkuDAOImpl implements GoodSkuDAO {
    @Override
    public List<WxbGoodSku> queryGoodSkuByPage(Integer page) {
        GoodSkuMapper goodSkuMapper= MybatixSessionFU.getSession().getMapper(GoodSkuMapper.class);
        List<WxbGoodSku> wxbGoodSkuList=goodSkuMapper.queryGoodSkuByPage(page, SystemCU.page.PAGE_SIZE);
        return wxbGoodSkuList;
    }
}
