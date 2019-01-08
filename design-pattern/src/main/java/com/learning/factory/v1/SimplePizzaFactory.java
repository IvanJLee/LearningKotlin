package com.learning.factory.v1;

import jdk.internal.jline.internal.Nullable;

/**
 * Simple Pizza factory
 *
 * @author  Ivan on 2018-09-25 23:55.
 * @version v0.1
 * @since   v1.0
 */
public class SimplePizzaFactory {

    public @Nullable
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equalsIgnoreCase(type)) {
            pizza = new CheesePizza();
        } else if ("clam".equalsIgnoreCase(type)) {
            pizza = new ClamPizza();
        } else if ("greek".equalsIgnoreCase(type)) {
            pizza = new GreekPizza();
        } else if ("pepperoni".equalsIgnoreCase(type)) {
            pizza = new PepperoniPizza();
        } else if ("veggie".equalsIgnoreCase(type)) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }

}
