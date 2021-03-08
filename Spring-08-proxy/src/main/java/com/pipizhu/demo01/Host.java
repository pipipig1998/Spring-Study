package com.pipizhu.demo01;

//房东 真实角色
public class Host implements Rent {
    @Override
    public void rent(){
        System.out.println("房东出租房子");
    }
}
