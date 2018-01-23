package com.ade.exp.design.decorator.bev;

import com.ade.exp.design.decorator.Beverage;

/**
 * Created by liyang on 18-1-23.
 */
public class HouseBlend implements Beverage {

    @Override
    public int cost() {
        return 5;
    }

}
