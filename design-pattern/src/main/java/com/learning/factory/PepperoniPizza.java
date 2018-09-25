package com.learning.factory;

/**
 * Pepperoni Pizza
 *
 * @author  Ivan on 2018-09-25 23:50.
 * @version v0.1
 * @since   v1.0
 */
public class PepperoniPizza extends Pizza {

    @Override
    String getType() {
        return PepperoniPizza.class.getSimpleName();
    }
}
