package com.yph.design.observer;

public interface Subject {
    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObserver(Object obj);
}
