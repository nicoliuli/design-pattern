package com.liuli.create.singleton;

// 懒汉式 静态内部类
public class Singleton07 {

    private Singleton07() {

    }



    private static class SingletonInstance{
        private static final Singleton07 instance = new Singleton07();
    }

    // 加了同步代码，保证线程安全
    public static Singleton07 getInstance() {
        return SingletonInstance.instance;
    }
}

/**
 * 优点：外部类装载时，内部类不会装载。解决lazy load问题，线程安全，推荐使用
 */
