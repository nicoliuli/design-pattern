package com.liuli.create.singleton;

// 饿汉式，静态常量
public class Singleton01 {

    private Singleton01(){

    }

    private final static Singleton01 instance = new Singleton01();

    public static Singleton01 getInstance(){
        return instance;
    }
}

/**
 优点：使用简单，在类装载的时候完成shi实例化，避免多线程问题
 缺点：达不到lazy load效果。如果这个类使用不到，可能会浪费内存

 */
