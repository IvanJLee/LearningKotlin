package com.learning.factory;

/**
 * Greek Pizza
 *
 * @author  Ivan on 2018-09-25 23:48.
 * @version v0.1
 * @since   v1.0
 */
public class GreekPizza extends Pizza {

    @Override
    String getType() {
        return GreekPizza.class.getSimpleName();
    }
}
