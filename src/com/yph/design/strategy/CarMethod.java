package com.yph.design.strategy;

public class CarMethod implements IMethod {
    @Override
    public void goToCompany() {
        System.out.println("打车！");
    }
}
