package com.ade.exp.design.observer.impl;

import com.ade.exp.design.observer.Observer;

/**
 * Created by liyang on 18-1-23.
 */
public class LeMonde implements Observer {

    @Override
    public void notify(String message) {
        if (message != null && message.contains("wine")) {
            System.out.println("Today cheese, wine and news! " + message);
        }
    }

}
