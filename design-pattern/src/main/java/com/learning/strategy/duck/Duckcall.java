package com.learning.strategy.duck;

/**
 * DuckCall is not duck
 *
 * @author  Ivan on 2018-05-23 00:22.
 * @version v0.1
 * @since   v1.0
 */
public class Duckcall {

    protected QuackBehavior quackBehavior;

    public Duckcall() {
        this.quackBehavior = new Quack();
    }

    public void setQuack(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
