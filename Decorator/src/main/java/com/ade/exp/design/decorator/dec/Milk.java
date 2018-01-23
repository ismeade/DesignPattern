package com.ade.exp.design.decorator.dec;

import com.ade.exp.design.decorator.Beverage;
import com.ade.exp.design.decorator.CondimentDecorator;

/**
 * Created by liyang on 18-1-23.
 */
public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 2;
    }

}
