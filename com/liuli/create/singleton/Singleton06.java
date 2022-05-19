package com.liuli.create.singleton;

// 懒汉式 线程安全
public class Singleton06 {

    private Singleton06() {

    }

    private static Singleton06 instance;

    // 加了同步代码，保证线程安全
    public static Singleton06 getInstance() {
        if (instance == null) {
            synchronized (Singleton06.class) {
                if (instance == null) {
                    instance = new Singleton06();
                }
            }
        }
        return instance;
    }
}

/**
 * 优点：解决lazy load问题，线程安全，推荐使用
 */
