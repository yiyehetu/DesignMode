package com.yph.design.strategy;

public class PlaneMethod implements IMethod {
    @Override
    public void goToCompany() {
        System.out.println("飞！");
    }
}
