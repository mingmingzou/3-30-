package com.qianfeng.fxmall.goodsku.dao.Impl;

import com.qianfeng.fxmall.commons.info.SystemCU;
import com.qianfeng.fxmall.commons.mybatis.MybatixSessionFU;
import com.qianfeng.fxmall.goodsku.bean.WxbGoodSku;
import com.qianfeng.fxmall.goodsku.dao.GoodSkuDAO;
import com.qianfeng.fxmall.goodsku.mapper.GoodSku.GoodSkuMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class GoodSkuDAOImpl implements GoodSkuDAO {
    @Override
    public List<WxbGoodSku> queryGoodSkuByPage(Integer page) {
        GoodSkuMapper goodSkuMapper= MybatixSessionFU.getSession().getMapper(GoodSkuMapper.class);
        List<WxbGoodSku> wxbGoodSkuList=goodSkuMapper.queryGoodSkuByPage(page, SystemCU.page.PAGE_SIZE);
        return wxbGoodSkuList;
    }

    @Override
    public void addGoodSku(WxbGoodSku wxbGoodSku) {
        SqlSession session=MybatixSessionFU.getSession();
        GoodSkuMapper goodSkuMapper=session.getMapper(GoodSkuMapper.class);
        goodSkuMapper.addGoodSku(wxbGoodSku);
        session.commit();
    }

    @Override
    public void deleteGoodSku(String skuId) {
        SqlSession session=MybatixSessionFU.getSession();
        GoodSkuMapper goodSkuMapper=session.getMapper(GoodSkuMapper.class);
        goodSkuMapper.deleteGoodSku(skuId);
        session.commit();
    }
}
