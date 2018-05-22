package com.learning;

import com.learning.strategy.duck.DecoyDuck;
import com.learning.strategy.duck.Duck;
import com.learning.strategy.duck.MallardDuck;
import com.learning.strategy.duck.ModelDuck;
import com.learning.strategy.duck.RedheadDuck;
import com.learning.strategy.duck.RubberDuck;

import java.util.ArrayList;
import java.util.List;

/**
 * test class
 *
 * @author  Ivan on 2018-05-22 23:48.
 * @version v0.1
 * @since   v1.0
 */
public class DesignPatternTest {

    public static void main(String[] args) {
        DesignPatternTest test = new DesignPatternTest();
        test.testDuck();
    }

    private void testDuck() {
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new DecoyDuck());
        ducks.add(new MallardDuck());
        ducks.add(new ModelDuck());
        ducks.add(new RedheadDuck());
        ducks.add(new RubberDuck());
        for (Duck duck : ducks) {
            duck.display();
            duck.swim();
            duck.performFly();
            duck.performQuack();
            System.out.println();
        }
    }
}
