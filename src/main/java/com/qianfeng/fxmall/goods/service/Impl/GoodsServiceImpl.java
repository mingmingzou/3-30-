package com.qianfeng.fxmall.goods.service.Impl;

import com.qianfeng.fxmall.commons.info.SystemCU;
import com.qianfeng.fxmall.goods.bean.WxbGood;
import com.qianfeng.fxmall.goods.dao.GoodsDAO;
import com.qianfeng.fxmall.goods.dao.Impl.GoodsDAOImpl;
import com.qianfeng.fxmall.goods.service.GoodsService;

import java.util.List;

public class GoodsServiceImpl implements GoodsService {
     GoodsDAO goodsDAO=new GoodsDAOImpl();
    @Override
    public List<WxbGood> queryGoodsByPage(Integer page) {
        if (page<1){
            throw new IndexOutOfBoundsException("页码不能小于1");
        }
        int index=(page-1)* SystemCU.page.PAGE_SIZE;
        List<WxbGood> goods=goodsDAO.queryGoodsByPage(index);
        return goods;
    }

    @Override
    public void addGoods(WxbGood wxbGood) {
        if (wxbGood.getGoodId() == null || wxbGood.getGoodName() == null || wxbGood.getGoodPic() == null
                || wxbGood.getGoodPic1() == null || wxbGood.getGoodPic2() == null || wxbGood.getPromoteDesc() == null
                || wxbGood.getSkuTitle() == null || wxbGood.getSkuCost() == null || wxbGood.getSkuPrice() == null ||
                wxbGood.getSkuPmoney() == null || wxbGood.getTypeId() == null || wxbGood.getCreateTime() == null) {
            throw new NullPointerException("关键属性不能为空！");
        } else {
            goodsDAO.addGoods(wxbGood);
        }
    }
    @Override
    public void deleteGoods(String goodId) {
        goodsDAO.deleteGoods(goodId);
    }

    @Override
    public void updateGoods(WxbGood wxbGood) {
        if (wxbGood.getGoodId() == null || wxbGood.getGoodName() == null || wxbGood.getGoodPic() == null
                || wxbGood.getGoodPic1() == null || wxbGood.getGoodPic2() == null || wxbGood.getPromoteDesc() == null
                || wxbGood.getSkuTitle() == null || wxbGood.getSkuCost() == null || wxbGood.getSkuPrice() == null ||
                wxbGood.getSkuPmoney() == null || wxbGood.getTypeId() == null || wxbGood.getCreateTime() == null) {
            throw new NullPointerException("关键属性不能为空！");
        } else {
            goodsDAO.updateGoods(wxbGood);
        }
    }
}
