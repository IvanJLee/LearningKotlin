package com.learning;

import com.learning.strategy.duck.DecoyDuck;
import com.learning.strategy.duck.Duck;
import com.learning.strategy.duck.MallardDuck;
import com.learning.strategy.duck.ModelDuck;
import com.learning.strategy.duck.RedheadDuck;
import com.learning.strategy.duck.RubberDuck;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * test for strategy pattern
 *
 * @author  Ivan on 2018-05-24 23:28.
 * @version v0.1
 * @since   v1.0
 */

public class StrategyTest {

    @Before
    public void beforeTest() {
        System.out.println("test Duck begin...");
    }

    @Test
    public void testDuck() {
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

    @After
    public void afterTest() {
        System.out.println("test Duck finished");
    }
}
