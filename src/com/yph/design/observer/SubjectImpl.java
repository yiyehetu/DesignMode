package com.yph.design.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SubjectImpl implements Subject {
    private final CopyOnWriteArrayList<Observer> observers = new CopyOnWriteArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(Object obj) {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            if (observer == null) {
                continue;
            }
            observer.changed(this, obj);
        }
    }
}
