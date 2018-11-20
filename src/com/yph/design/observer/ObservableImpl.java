package com.yph.design.observer;

import java.util.Observable;

public class ObservableImpl extends Observable {
    @Override
    public synchronized void setChanged() {
        super.setChanged();
    }
}
