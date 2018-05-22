package com.learning.strategy.duck;

/**
 * squeak
 *
 * @author  Ivan on 2018-05-23 00:04.
 * @version v0.1
 * @since   v1.0
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
       System.out.println("squeak");
    }
}
