package com.yph.design.observer;

import java.util.Observable;
import java.util.Observer;

public class Observer3 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(getClass().getSimpleName() + " changed, arg:" + arg.toString());
    }
}
