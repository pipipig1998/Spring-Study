package com.pipizhu.demo01;

import java.util.Properties;

public class Client {
    public static void main(String[] args) {
        Host host =new Host();
//        host.rent();


        //代理角色一般会有很多附属操作，比如看房子，签合同等
        Proxy proxy=new Proxy(host);
        proxy.rent();
    }
}
