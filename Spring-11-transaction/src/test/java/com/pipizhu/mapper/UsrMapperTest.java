package com.pipizhu.mapper;

import com.pipizhu.pojo.Usr;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UsrMapperTest {
    @Test
    public void selectUsr(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfiguration.xml");
        UsrMapper usrMapper = context.getBean("usrMapper", UsrMapper.class);
        List<Usr> usrs = usrMapper.selectUsr();
        for (Usr usr : usrs) {
            System.out.println(usr);
        }
    }
}
