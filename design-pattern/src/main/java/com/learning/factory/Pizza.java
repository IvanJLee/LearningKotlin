package com.learning.factory;

/**
 * abstract Pizza
 *
 * @author  Ivan J. Lee on 2018-09-25 23:43.
 * @version v0.1
 * @since   v1.0
 */
abstract public class Pizza {

    public void prepare() {
        System.out.println("prepare");
    }

    public void bake() {
        System.out.println("bake");
    }

    public void cut() {
        System.out.println("cut");
    }

    public void box() {
        System.out.println("box");
    }

    abstract String getType();

}
