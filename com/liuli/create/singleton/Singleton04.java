package com.liuli.create.singleton;

// 懒汉式 线程安全
public class Singleton04 {

    private Singleton04() {

    }

    private static Singleton04 instance;

    // 加了同步代码，保证线程安全
    public static synchronized Singleton04 getInstance() {
        if (instance == null) {
            instance = new Singleton04();
        }
        return instance;
    }
}

/**
 优点：解决了线程安全问题
 缺点：每个线程在获取实例的时候，都会进行同步，效率太低，生产环境禁止使用
 */
