package com.learning.strategy.duck;

/**
 * fly with wings
 *
 * @author  Ivan on 2018-05-22 23:57.
 * @version v0.1
 * @since   v1.0
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("flying with wings");
    }
}
