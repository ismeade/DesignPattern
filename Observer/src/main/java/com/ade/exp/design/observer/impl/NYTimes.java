package com.ade.exp.design.observer.impl;

import com.ade.exp.design.observer.Observer;

/**
 * Created by liyang on 18-1-23.
 */
public class NYTimes implements Observer {

    @Override
    public void notify(String message) {
        if (message != null && message.contains("money")) {
            System.out.println("Breaking news in NY! " + message);
        }
    }

}
