package com.liuli.create.singleton;

// 懒汉式 线程不安全
public class Singleton03 {

    private Singleton03() {

    }

    private static Singleton03 instance;

    public static Singleton03 getInstance() {
        if (instance == null) {
            instance = new Singleton03();
        }
        return instance;
    }
}

/**
 优点：起到lazy load效果
 缺点：有线程安全问题，生产中不能用这样的方式
 */
