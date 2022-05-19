package com.liuli.create.singleton;

// 懒汉式 枚举
public enum Singleton08 {
    INSTANCE;

    public void method(){
        System.out.println("hello");
    }

}

/**
 * 优点：避免多线程问题，还能防止反序列化重新创建对象，提倡使用
 */
