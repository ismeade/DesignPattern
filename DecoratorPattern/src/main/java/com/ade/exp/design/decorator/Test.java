package com.ade.exp.design.decorator;

import com.ade.exp.design.decorator.bev.HouseBlend;
import com.ade.exp.design.decorator.dec.Milk;

/**
 * Created by liyang on 18-1-23.
 */
public class Test {

    public static void main(String[] args) {
        Beverage houseBlend = new HouseBlend();
        System.out.println(houseBlend.cost());
        // 加奶（用奶装饰者包上 被装饰对象）
        Milk milkHouseBlend = new Milk(houseBlend);
        System.out.println(milkHouseBlend.cost());
    }

}
