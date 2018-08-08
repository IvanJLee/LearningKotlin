package com.learning;

import com.learning.decorator.Beverage;
import com.learning.decorator.DarkRoast;
import com.learning.decorator.Decaf;
import com.learning.decorator.Espresso;
import com.learning.decorator.HouseBlend;
import com.learning.decorator.Mocha;
import com.learning.decorator.Soy;
import com.learning.decorator.Whip;

import org.junit.Test;

/**
 * StarBuzz
 *
 * @author  Ivan J. Lee on 2018-08-09 00:22.
 * @version v0.1
 * @since   v1.0
 */
public class DecoratorTest extends TestCase {

    private void printBeverage(Beverage beverage) {
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }

    @Test
    public void testEspresso() {
        Beverage beverage = new Espresso();
        printBeverage(beverage);
    }

    @Test
    public void testDarkRoatWhip() {
        Beverage beverage = new Whip(new DarkRoast());
        printBeverage(beverage);
    }

    @Test
    public void testHouseBlendDoubleMocha() {
        Beverage houseBlend = new HouseBlend();
        Beverage mocha = new Mocha(houseBlend);
        Beverage doubleMocha = new Mocha(mocha);
        printBeverage(doubleMocha);
    }

    @Test
    public void testDecafMochaSoyWhip() {
        Beverage beverage = new Decaf();
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);
        beverage = new Whip(beverage);
        printBeverage(beverage);
    }
}
