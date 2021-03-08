package com.pipizhu.test1;

public class Shop implements Sail{
    private Factory factory;

    public Shop() {
    }

    public Shop(Factory factory) {
        this.factory = factory;
    }

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    @Override
    public void Sail() {
        factory.Sail();
        count();
        zhekou();
    }
    public void count(){
        System.out.println("统计销售量");
    }
    public void zhekou(){
        System.out.println("打折");
    }
}
