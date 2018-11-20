package com.yph.design.strategy;

public class DefaultMethod implements IMethod {
    @Override
    public void goToCompany() {
        System.out.println("走！");
    }
}
