package com.learning.decorator;

/**
 * the beverage
 *
 * @author  Ivan J. Lee on 2018-08-08 23:58.
 * @version v0.1
 * @since   v1.0
 */
public abstract class Beverage {

    protected String description = "unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
