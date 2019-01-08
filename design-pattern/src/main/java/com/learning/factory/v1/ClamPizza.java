package com.learning.factory.v1;

/**
 * Clam Pizza
 *
 * @author  Ivan on 2018-09-25 23:51.
 * @version v0.1
 * @since   v1.0
 */
public class ClamPizza extends Pizza {

    @Override
    String getType() {
        return ClamPizza.class.getSimpleName();
    }
}
