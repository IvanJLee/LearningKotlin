package com.learning.strategy.duck;

/**
 * Decoy Duck
 *
 * @author  Ivan on 2018-05-23 00:19.
 * @version v0.1
 * @since   v1.0
 */
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("Decoy Duck");
    }
}
