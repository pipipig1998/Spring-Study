package com.pipizhu.demo03;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host =new Host();
        //代理角色，但是得动态生成，调用函数
        ProxyInvocationhandler PIH = new ProxyInvocationhandler();
        PIH.setRent(host);
        Rent proxy = (Rent) PIH.getProxy();
        proxy.rent();
    }
}
