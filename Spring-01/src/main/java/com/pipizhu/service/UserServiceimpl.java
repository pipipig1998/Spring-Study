package com.pipizhu.service;

import com.pipizhu.dao.UserDao;
import com.pipizhu.dao.UserDaoMysqlimpl;
import com.pipizhu.dao.UserDaoOrcleimpl;
import com.pipizhu.dao.UserDaoimpl;

public class UserServiceimpl {
    //原先的写法
//    private UserDao userDao=new UserDaoMysqlimpl();
//    private UserDao userDao2=new UserDaoOrcleimpl()

    //ioc思想
    private UserDao userdao;

    public void setUserdao(UserDao userdao) {
        this.userdao = userdao;
    }

    public void getUser(){
        userdao.getUser();
    }
}
