package com.qianfeng.fxmall;

import com.qianfeng.fxmall.goods.bean.WxbGood;
import com.qianfeng.fxmall.goods.dao.GoodsDAO;
import com.qianfeng.fxmall.goods.dao.Impl.GoodsDAOImpl;
import com.qianfeng.fxmall.goods.service.GoodsService;
import com.qianfeng.fxmall.goods.service.Impl.GoodsServiceImpl;

import java.sql.Timestamp;
import java.util.List;
import java.util.Random;

public class TestGood {
    public static void main(String[] args){
     /*   new Thread(new Runnable() {
            @Override
            public void run() {
                GoodsDAO goodsDAO=new GoodsDAOImpl();
                List<WxbGood> wxbGoods = goodsDAO.queryGoodsByPage(0);
                System.out.println(wxbGoods.get(0).getGoodName());

            }
        }).start();*/
   /*  new Thread(new Runnable() {
         @Override
         public void run() {
             WxbGood good=new WxbGood();
             Random random=new Random();
             String stu="";
             for (int i=0;i<8;i++){
                 int a=random.nextInt(10);
                 stu=stu+""+a;
             }
             good.setGoodId(stu);
             good.setGoodName("可比克");
             good.setCustomerId("69609206");
             good.setGoodPic("xxx.png");
             good.setGoodPic1("xxx.png");
             good.setGoodPic2("xxx.png");
             good.setPromoteDesc("123123");
             good.setSkuTitle("12");
             good.setSkuCost("11");
             good.setSkuPrice("1");
             good.setSkuPmoney("1");
             good.setCopyIds("1111111111111");
             good.setOrderNo(1230);
             good.setTypeId("03");
             good.setTags("2");
             good.setState(1);
             Timestamp time=new Timestamp(System.currentTimeMillis());
             good.setCreateTime(time);
             good.setSpcId("123");
             good.setSellNum(5);
             good.setIswxpay(0);
             good.setIsfdfk(1);
             GoodsService gs=new GoodsServiceImpl();
             System.out.println(good.getGoodName());
             gs.addGoods(good);
         }
     }).start();*/
    /* new Thread(new Runnable() {
         @Override
         public void run() {
             GoodsService gs=new GoodsServiceImpl();
             gs.deleteGoods("pb1n3rya");
         }
     }).start();*/
        new Thread(new Runnable() {
            @Override
            public void run() {
                WxbGood good=new WxbGood();
                good.setGoodId("73515420");
                good.setGoodName("魔芋");
                good.setCustomerId("69609206");
                good.setGoodPic("xxx.png");
                good.setGoodPic1("xxx.png");
                good.setGoodPic2("xxx.png");
                good.setPromoteDesc("123123");
                good.setSkuTitle("12");
                good.setSkuCost("11");
                good.setSkuPrice("1");
                good.setSkuPmoney("1");
                good.setCopyIds("1111111111111");
                good.setOrderNo(1230);
                good.setTypeId("03");
                good.setTags("2");
                good.setState(1);
                Timestamp time=new Timestamp(System.currentTimeMillis());
                good.setCreateTime(time);
                good.setSpcId("123");
                good.setSellNum(5);
                good.setIswxpay(0);
                good.setIsfdfk(1);
                GoodsService gs=new GoodsServiceImpl();
                System.out.println(good.getGoodName());
                gs.updateGoods(good);
            }
        }).start();
    }
}
