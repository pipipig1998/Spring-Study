package com.pipizhu.dao;

import com.pipizhu.Utils.MybatisUtils;
import com.pipizhu.pojo.Usr;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UsrMapperTest {
    @Test
    public void selectUsr(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UsrMapper usrMapper = (UsrMapper) context.getBean("usrMapper");
        for (Usr usr : usrMapper.selectUsr()) {
            System.out.println(usr);
        }
    }
}
