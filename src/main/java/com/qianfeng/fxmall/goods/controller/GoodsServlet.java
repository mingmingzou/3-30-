package com.qianfeng.fxmall.goods.controller;

import com.qianfeng.fxmall.goods.bean.WxbGood;
import com.qianfeng.fxmall.goods.service.GoodsService;
import com.qianfeng.fxmall.goods.service.Impl.GoodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GoodsServlet extends HttpServlet {
    GoodsService goodsService=new GoodsServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pageStu=req.getParameter("page");
       pageStu= pageStu==null?"0":pageStu;
       int page=Integer.parseInt(pageStu);
        List<WxbGood> goods=goodsService.queryGoodsByPage(page);
        req.setAttribute("goods",goods);
        req.getRequestDispatcher("goods_list.jsp").forward(req,resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
