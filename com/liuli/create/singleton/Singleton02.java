package com.liuli.create.singleton;

// 饿汉式，静态代码块
public class Singleton02 {

    private Singleton02(){

    }


    static {
        instance = new Singleton02();
    }
    private final static Singleton02 instance;

    public static Singleton02 getInstance(){
        return instance;
    }
}

/**
 优点：使用简单，在类装载的时候完成shi实例化，避免多线程问题
 缺点：达不到lazy load效果。如果这个类使用不到，可能会浪费内存
 */
