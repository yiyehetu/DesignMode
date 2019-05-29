package com.yph.design.factory;

public class Main {

    public static void main(String[] args) {
        FruitFactory factory = new FruitFactoryImpl();

        Fruit apple = factory.createFruit("apple");
        apple.price();

        Fruit orange = factory.createFruit("orange");
        orange.price();

        Fruit banana = factory.createFruit("banana");
        banana.price();
    }
}
