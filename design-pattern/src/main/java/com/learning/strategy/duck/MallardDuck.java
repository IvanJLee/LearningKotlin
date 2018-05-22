package com.learning.strategy.duck;

/**
 * Mallard Duck
 *
 * @author  Ivan on 2018-05-23 00:09.
 * @version v0.1
 * @since   v1.0
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }
}
