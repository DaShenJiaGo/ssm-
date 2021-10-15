package com.bejing.uilte;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author wjl2020
 */
public class MybatisUilte {
   private static SqlSessionFactory factory=null;
    static {
        try {
            InputStream in = Resources.getResourceAsStream("mybatis.xml");
             factory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSession(){
        SqlSession  sqlSession =null;
        if (factory!=null){
            //非自动提交事物,因为只有增删改才要提交事物
            sqlSession= factory.openSession();
        }
        return sqlSession;
    }
}
