package com.learning.decorator;

/**
 * Coffee Whip
 *
 * @author  Ivan J. Lee on 2018-08-09 00:20.
 * @version v0.1
 * @since   v1.0
 */
public class Whip extends CondimentDecortor {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.48D;
    }
}
