package com.ade.exp.design.observer;

import com.ade.exp.design.observer.impl.Guardian;
import com.ade.exp.design.observer.impl.LeMonde;
import com.ade.exp.design.observer.impl.NYTimes;

/**
 * Created by liyang on 18-1-23.
 */
public class ObserverMain {

    public static void main(String[] args) {

        Subject subject = new Subject();
        subject.registerObserver(new NYTimes());
        subject.registerObserver(new Guardian());
        subject.registerObserver(new LeMonde());

        subject.notifyObserver("The queen said her favourite book is Java 8 in Action. money");
    }

}
