package com.qianfeng.fxmall.goodsku.dao.Impl;

import com.qianfeng.fxmall.commons.info.SystemCU;
import com.qianfeng.fxmall.goodsku.bean.WxbGoodSku;
import com.qianfeng.fxmall.goodsku.dao.GoodSkuDAO;
import com.qianfeng.fxmall.goodsku.mapper.GoodSku.GoodSkuMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class GoodSkuDAOImpl implements GoodSkuDAO {
    @Autowired
    private SqlSession session;
    @Override
    public List<WxbGoodSku> queryGoodSkuByPage(Integer page) {
        GoodSkuMapper goodSkuMapper= session.getMapper(GoodSkuMapper.class);
        List<WxbGoodSku> wxbGoodSkuList=goodSkuMapper.queryGoodSkuByPage(page, SystemCU.page.PAGE_SIZE);
        return wxbGoodSkuList;
    }

    @Override
    public void addGoodSku(WxbGoodSku wxbGoodSku) {
        GoodSkuMapper goodSkuMapper=session.getMapper(GoodSkuMapper.class);
        goodSkuMapper.addGoodSku(wxbGoodSku);
        session.commit();
    }

    @Override
    public void deleteGoodSku(String skuId) {
        GoodSkuMapper goodSkuMapper=session.getMapper(GoodSkuMapper.class);
        goodSkuMapper.deleteGoodSku(skuId);
        session.commit();
    }

    @Override
    public void updateGoodSku(WxbGoodSku wxbGoodSku) {
        GoodSkuMapper goodSkuMapper=session.getMapper(GoodSkuMapper.class);
        goodSkuMapper.updateGoodSku(wxbGoodSku);
        session.commit();
    }
}
