package com.learning.strategy.game;

/**
 * character
 *
 * @author  Ivan on 2018-05-23 23:09.
 * @version v0.1
 * @since   v1.0
 */
public class Character {

    protected Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void fight() {
        weapon.useWeapon();
    }
}
