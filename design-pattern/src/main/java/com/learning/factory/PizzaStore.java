package com.learning.factory;

import com.sun.istack.internal.NotNull;

/**
 * Pizza Store
 *
 * @author  Ivan on 2018-09-25 23:54.
 * @version v0.1
 * @since   v1.0
 */
class PizzaStore {

    private @NotNull SimplePizzaFactory factory;

    public PizzaStore(@NotNull SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public static PizzaStore getStore(SimplePizzaFactory factory) {
        return new PizzaStore(factory);
    }

    public Pizza order(String type) {
        Pizza pizza = factory.createPizza(type);
        if (pizza == null) {
            throw new IllegalArgumentException("failed to create pizza, unknown type " + type);
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
