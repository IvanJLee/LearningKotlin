package com.learning.factory;

/**
 * Veggie Pizza
 *
 * @author  Ivan on 2018-09-25 23:52.
 * @version v0.1
 * @since   v1.0
 */
public class VeggiePizza extends Pizza {
    @Override
    String getType() {
        return VeggiePizza.class.getSimpleName();
    }
}
