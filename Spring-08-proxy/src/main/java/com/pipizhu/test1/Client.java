package com.pipizhu.test1;

public class Client {



    public void buy() {
        Factory factory=new Factory();
        Shop shop=new Shop(factory);
        shop.Sail();
    }
}
