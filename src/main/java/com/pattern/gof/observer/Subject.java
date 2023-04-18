package com.pattern.gof.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    void add(Observer o) {
        observers.add(o);
    }

    void remove(Observer o) {
        observers.remove(o);
    }

    void notifyObservers(Message message) {
        for (Observer observer : observers) {
            observer.handleEvent(message);
        }
    }
}
