package com.learning.decorator;

/**
 * Mocha coffee
 *
 * @author  Ivan J. Lee on 2018-08-09 00:13.
 * @version v0.1
 * @since   v1.0
 */
public class Mocha extends CondimentDecortor{

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20D;
    }
}
