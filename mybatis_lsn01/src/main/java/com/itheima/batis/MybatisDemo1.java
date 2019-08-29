package com.itheima.batis;


import com.itheima.dao.IUserDao;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class MybatisDemo1 {

    @Test
    public void test1() throws Exception {

        System.out.println("=========");

        InputStream inputStream = Resources.getResourceAsStream("myabtis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);

        User user = new User();
        user.setUsername("lala");
        user.setBirthday(new Date());
        user.setSex("1");
        user.setAddress("湖北武汉");
        mapper.add(user);

        System.out.println("新加的代码...");


        sqlSession.close();
        inputStream.close();

    }
}
