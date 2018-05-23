package com.learning.strategy.game;

/**
 *
 * @author  Ivan on 2018-05-23 23:16.
 * @version v0.1
 * @since   v1.0
 */
class Knife implements Weapon {

    @Override
    public void useWeapon() {
        System.out.println("use knife to cut");
    }
}
