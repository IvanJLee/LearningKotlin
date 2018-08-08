package com.learning.decorator;

/**
 * Espresso coffee
 *
 * @author  Ivan J. Lee on 2018-08-09 00:03.
 * @version v0.1
 * @since   v1.0
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99D;
    }
}
