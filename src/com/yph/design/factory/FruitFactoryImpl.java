package com.yph.design.factory;

public class FruitFactoryImpl implements FruitFactory {

    @Override
    public Fruit createFruit(String name) {
        if (name == null) {
            return null;
        }
        switch (name) {
            case "apple":
                return new Apple();
            case "orange":
                return new Orange();
            case "banana":
                return new Banana();
            default:
                return null;
        }
    }
}
