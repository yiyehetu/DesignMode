package com.yph.design.decorator;

public class DecoratorImpl2 extends DecoratorComponent {
    public DecoratorImpl2(Component component) {
        super(component);
    }

    public void methodD() {
        System.out.println("this is DecoratorImpl2 methodD");
    }
}
