package com.learning.strategy.duck;

/**
 * Model Duck
 *
 * @author  Ivan on 2018-05-23 00:30.
 * @version v0.1
 * @since   v1.0
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithRocket();
    }

    @Override
    public void display() {
        System.out.println("Model duck");
    }
}
