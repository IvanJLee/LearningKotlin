package com.learning.decorator;

/**
 * Houseblend coffee
 *
 * @author  Ivan J. Lee on 2018-08-09 00:05.
 * @version v0.1
 * @since   v1.0
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89D;
    }
}
