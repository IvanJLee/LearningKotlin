package com.learning.strategy.game;

/**
 *
 *
 * @author  Ivan on 2018-05-23 23:20.
 * @version v0.1
 * @since   v1.0
 */
class Axe implements Weapon {

    @Override
    public void useWeapon() {
        System.out.print("use axe to hack");
    }
}
