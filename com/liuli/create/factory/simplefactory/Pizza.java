package com.liuli.create.factory.simplefactory;

public abstract class Pizza {
    protected String name;

    // 准备原材料，不同的pizza方法一般不同，所以做成抽象方法
    abstract void prepare();

    void bake(){
        System.out.println(name + " bake");
    }

    void cut(){
        System.out.println(name + " cut");
    }

    void box(){
        System.out.println(name + " box");
    }

    public void setName(String name) {
        this.name = name;
    }
}

/**
 * 缺点：违背了对扩展开放，对修改关闭的原则。
 * 如果增加一个子类，调用方需要修改逻辑
 */
