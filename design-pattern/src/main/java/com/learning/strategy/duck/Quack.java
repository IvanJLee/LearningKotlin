package com.learning.strategy.duck;

/**
 * quack behavior
 *
 * @author  Ivan on 2018-05-23 00:02.
 * @version v0.1
 * @since   v1.0
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("quack");
    }
}
