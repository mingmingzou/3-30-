package com.qianfeng.fxmall.goods.dao.Impl;

import com.qianfeng.fxmall.commons.info.SystemCU;
import com.qianfeng.fxmall.goods.bean.WxbGood;
import com.qianfeng.fxmall.goods.dao.GoodsDAO;
import com.qianfeng.fxmall.goods.mapper.Goods.GoodsMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GoodsDAOImpl implements GoodsDAO {
    @Autowired
    private  SqlSession session;
    @Override
    public List<WxbGood> queryGoodsByPage(Integer page) {
            GoodsMapper goodsMapper= session.getMapper(GoodsMapper.class);
        List<WxbGood> goods=goodsMapper.queryGoodByPage(page, SystemCU.page.PAGE_SIZE);
        return goods;
    }

    @Override
    public void addGoods(WxbGood wxbGood) {

        GoodsMapper goodsMapper=session.getMapper(GoodsMapper.class);
        goodsMapper.addGoods(wxbGood);
        session.commit();
    }

    @Override
    public void deleteGoods(String goodId) {
        GoodsMapper goodsMapper=session.getMapper(GoodsMapper.class);
        goodsMapper.deleteGoods(goodId);
        session.commit();
    }

    @Override
    public void updateGoods(WxbGood wxbGood) {
        GoodsMapper goodsMapper=session.getMapper(GoodsMapper.class);
        goodsMapper.updateGoods(wxbGood);
        session.commit();
    }

}
