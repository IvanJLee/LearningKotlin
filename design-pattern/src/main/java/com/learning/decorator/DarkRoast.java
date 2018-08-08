package com.learning.decorator;

/**
 * DarkRoast
 *
 * @author  DarkRoast on 2018-08-09 00:08.
 * @version v0.1
 * @since   v1.0
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 1.69D;
    }
}
