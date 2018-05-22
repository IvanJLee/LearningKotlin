package com.learning.strategy.duck;

/**
 * no flying behavior
 *
 * @author  Ivan on 2018-05-22 23:59.
 * @version v0.1
 * @since   v1.0
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("emm... I cannot fly.");
    }
}
