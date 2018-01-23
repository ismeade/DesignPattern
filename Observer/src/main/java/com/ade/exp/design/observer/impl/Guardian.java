package com.ade.exp.design.observer.impl;

import com.ade.exp.design.observer.Observer;

/**
 * Created by liyang on 18-1-23.
 */
public class Guardian implements Observer {

    @Override
    public void notify(String message) {
        if (message != null && message.contains("queen")) {
            System.out.println("Yet another news in London... " + message);
        }
    }

}
