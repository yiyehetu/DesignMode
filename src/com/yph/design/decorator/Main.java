package com.yph.design.decorator;

/**
 * 装饰者模式，增强类的功能
 */
public class Main {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();

        component.methodA();
        component.methodB();

        System.out.println("-------------------------------------------");

        DecoratorImpl1 impl1 = new DecoratorImpl1(component);
        impl1.methodA();
        impl1.methodB();
        impl1.methodC();

        System.out.println("-------------------------------------------");
        DecoratorImpl2 impl2 = new DecoratorImpl2(component);
        impl2.methodA();
        impl2.methodB();
        impl2.methodD();


    }
}
