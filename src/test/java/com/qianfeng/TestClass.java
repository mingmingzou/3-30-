package com.qianfeng;

import com.qianfeng.fxmall.goods.dao.GoodsDAO;
import com.qianfeng.fxmall.goods.service.GoodsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestClass {
    @Autowired
    private GoodsDAO goodsDAO;
    @Test
    public void  testClas(){
       goodsDAO.deleteGoods("44671132");
    }
    @Autowired
    private GoodsService goodsService;
    @Test
    public void testClas2(){
        goodsService.deleteGoods("14886110");
    }
}
