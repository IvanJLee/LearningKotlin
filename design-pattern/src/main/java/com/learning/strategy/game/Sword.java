package com.learning.strategy.game;

/**
 * Sword
 *
 * @author  Ivan on 2018-05-23 23:22.
 * @version v0.1
 * @since   v1.0
 */
class Sword implements Weapon {
    @Override
    public void useWeapon() {
        System.out.println("wield the sword");
    }
}
