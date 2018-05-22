package com.learning.strategy.duck;

/**
 * Redhead Duck
 *
 * @author  Ivan on 2018-05-23 00:17.
 * @version v0.1
 * @since   v1.0
 */
public class RedheadDuck extends Duck {

    public RedheadDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Redhead Duck");
    }
}
