package com.yph.design.strategy;

public class Person {
    private IMethod method;

    public Person() {
        method = new DefaultMethod();
    }

    public void setMethod(IMethod method) {
        this.method = method;
    }

    public void goToCompany() {
        method.goToCompany();
    }
}
