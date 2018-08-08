package com.learning.decorator;

/**
 * Decaffeinated Coffee
 *
 * @author  Ivan J. Lee on 2018-08-09 00:11.
 * @version v0.1
 * @since   v1.0
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaffeinated Coffee";
    }

    @Override
    public double cost() {
        return 2.49D;
    }
}
