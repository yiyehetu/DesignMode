package com.yph.design.observer;

public class ObserverImpl1 implements Observer {
    @Override
    public void changed(Subject subject, Object obj) {
        System.out.println(getClass().getSimpleName() + " changed, obj:" + obj.toString());
    }
}
