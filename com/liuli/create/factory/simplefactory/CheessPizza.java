package com.liuli.create.factory.simplefactory;

public class CheessPizza extends Pizza{
    @Override
    void prepare() {
        System.out.println("CheessPizza prepare");
    }
}
