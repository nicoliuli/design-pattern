package com.liuli.create.factory.simplefactory;

public class SimpleFactory {
    // 根据类型创建对象，对外隐藏创建细节
    public Pizza create(String type) {
        Pizza pizza = null;
        if (type.equals("cheess")) {
            pizza = new CheessPizza();
        } else if (type.equals("breek")) {
            pizza = new BreekPizza();
        }
        return pizza;
    }
}
