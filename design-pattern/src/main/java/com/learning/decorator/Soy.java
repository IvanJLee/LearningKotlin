package com.learning.decorator;

/**
 * Soy coffee
 *
 * @author  Ivan J. Lee on 2018-08-09 00:16.
 * @version v0.1
 * @since   v1.0
 */
public class Soy extends CondimentDecortor {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.19D;
    }
}
