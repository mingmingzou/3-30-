package com.qianfeng.fxmall.goodsku.service.Impl;

import com.qianfeng.fxmall.commons.info.SystemCU;
import com.qianfeng.fxmall.goods.dao.GoodsDAO;
import com.qianfeng.fxmall.goodsku.bean.WxbGoodSku;
import com.qianfeng.fxmall.goodsku.dao.GoodSkuDAO;
import com.qianfeng.fxmall.goodsku.dao.Impl.GoodSkuDAOImpl;
import com.qianfeng.fxmall.goodsku.service.GoodSkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GoodSkuServiceImpl implements GoodSkuService {
//     GoodSkuDAO goodSkuDAO=new GoodSkuDAOImpl();
    @Autowired
     private GoodSkuDAO goodSkuDAO;
    @Override
    public void addGoodSku(WxbGoodSku wxbGoodSku) {
        goodSkuDAO.addGoodSku(wxbGoodSku);
    }

    @Override
    public List<WxbGoodSku> queryGoodSkuByPage(Integer page) {
        if(page<1){
            throw new IndexOutOfBoundsException("页面不能小于1");
        }
        int index=(page-1)* SystemCU.page.PAGE_SIZE;
        return goodSkuDAO.queryGoodSkuByPage(index);
    }

    @Override
    public void deleteGoodSku(String skuId) {
        goodSkuDAO.deleteGoodSku(skuId);
    }

    @Override
    public void updateGoodSku(WxbGoodSku wxbGoodSku) {
        goodSkuDAO.updateGoodSku(wxbGoodSku);
    }
}
