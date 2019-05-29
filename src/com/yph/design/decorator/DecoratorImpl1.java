package com.yph.design.decorator;

public class DecoratorImpl1 extends DecoratorComponent {
    public DecoratorImpl1(Component component) {
        super(component);
    }

    public void methodC() {
        System.out.println("this is DecoratorImpl1 methodC");
    }
}
