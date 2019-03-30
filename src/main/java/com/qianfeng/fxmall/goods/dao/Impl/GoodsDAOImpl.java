package com.qianfeng.fxmall.goods.dao.Impl;

import com.qianfeng.fxmall.commons.info.SystemCU;
import com.qianfeng.fxmall.commons.mybatis.MybatixSessionFU;
import com.qianfeng.fxmall.goods.bean.WxbGood;
import com.qianfeng.fxmall.goods.dao.GoodsDAO;
import com.qianfeng.fxmall.goods.mapper.Goods.GoodsMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class GoodsDAOImpl implements GoodsDAO {
    @Override
    public List<WxbGood> queryGoodsByPage(Integer page) {
            GoodsMapper goodsMapper= MybatixSessionFU.getSession().getMapper(GoodsMapper.class);
        List<WxbGood> goods=goodsMapper.queryGoodByPage(page, SystemCU.page.PAGE_SIZE);
        return goods;
    }

    @Override
    public void addGoods(WxbGood wxbGood) {
        SqlSession session=MybatixSessionFU.getSession();
        GoodsMapper goodsMapper=session.getMapper(GoodsMapper.class);
        goodsMapper.addGoods(wxbGood);
        session.commit();
    }

    @Override
    public void deleteGoods(String goodId) {
        SqlSession session=MybatixSessionFU.getSession();
        GoodsMapper goodsMapper=session.getMapper(GoodsMapper.class);
        goodsMapper.deleteGoods(goodId);
        session.commit();
    }

    @Override
    public void updateGoods(WxbGood wxbGood) {
        SqlSession session=MybatixSessionFU.getSession();
        GoodsMapper goodsMapper=session.getMapper(GoodsMapper.class);
        goodsMapper.updateGoods(wxbGood);
        session.commit();
    }

}
