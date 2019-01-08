package com.learning.factory.v2;

/**
 * PizzaIngredientFactory
 *
 * @author  Ivan on 2019-01-09 00:00.
 * @version v0.1
 * @since   v1.0
 */
public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClams();

}
