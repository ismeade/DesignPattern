package com.ade.exp.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liyang on 18-1-23.
 */
public class Subject {

    private final List<Observer> observerList = new ArrayList<>();

    public void registerObserver(Observer observer) {
        this.observerList.add(observer);
    }

    public void notifyObserver(String message) {
        observerList.stream().parallel().forEach(observer -> observer.notify(message));
    }

}
