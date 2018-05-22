package com.learning.strategy.duck;

/**
 * Rubber Duck
 *
 * @author  Ivan on 2018-05-23 00:18.
 * @version v0.1
 * @since   v1.0
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        this.quackBehavior = new Squeak();
        this.flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("rubber duck");
    }
}
