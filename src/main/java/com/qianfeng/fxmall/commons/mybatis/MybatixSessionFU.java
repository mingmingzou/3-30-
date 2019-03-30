package com.qianfeng.fxmall.commons.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * sessionfactory的封装：做到全局唯一
 */
public class MybatixSessionFU {

    /*
    * 饿汉单例
    * */
    public static SqlSessionFactory sessionFactory;
    private static ThreadLocal<SqlSession> threadLocal=new ThreadLocal<>();

    private static void initsessionF(){
        try {
            InputStream stream = Resources.getResourceAsStream("mybatis.cfg.xml");
            sessionFactory = new SqlSessionFactoryBuilder().build(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   static{
       initsessionF();
   }

   public static  SqlSessionFactory getSqlsessionFactory(){
       if (sessionFactory==null){
           initsessionF();
       }
       return sessionFactory;
   }
   public static SqlSession getSession() {
   SqlSession session=threadLocal.get();
   if(session==null){
        session=sessionFactory.openSession();
        threadLocal.set(session);
   }
   return session;
   }
}
