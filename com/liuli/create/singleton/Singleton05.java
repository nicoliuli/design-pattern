package com.liuli.create.singleton;

// 懒汉式 线程不安全
public class Singleton05 {

    private Singleton05() {

    }

    private static Singleton05 instance;

    // 加了同步代码，保证线程安全
    public static Singleton05 getInstance() {
        if (instance == null) {
            synchronized (Singleton05.class){
                instance = new Singleton05();
            }
        }
        return instance;
    }
}

/**
 缺点：解决不了线程安全问题，禁止使用
 */
