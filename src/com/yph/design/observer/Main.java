package com.yph.design.observer;

import java.util.Observable;

public class Main {
    public static void main(String[] args) {
        SubjectImpl subject = new SubjectImpl();
        subject.registerObserver(new ObserverImpl1());
        subject.registerObserver(new ObserverImpl2());
        subject.registerObserver(new ObserverImpl3());
        subject.notifyObserver("Hello Observer");


        ObservableImpl observable = new ObservableImpl();
        observable.addObserver(new Observer1());
        observable.addObserver(new Observer2());
        observable.addObserver(new Observer3());
        observable.setChanged();
        observable.notifyObservers("Hello Observer");
    }
}
