package com.learning.strategy.duck;

/**
 * fly with rocket
 *
 * @author  Ivan on 2018-05-23 00:01.
 * @version v0.1
 * @since   v1.0
 */
public class FlyWithRocket implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Wow! I can fly with rocket");
    }
}
