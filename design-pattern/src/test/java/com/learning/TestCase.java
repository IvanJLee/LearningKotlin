package com.learning;

import org.junit.After;
import org.junit.Before;

/**
 * test case
 *
 * @author  Ivan on 2018-05-24 23:29.
 * @version v0.1
 * @since   v1.0
 */
public abstract class TestCase {

    @Before
    public void beforeTest() {
        System.out.println(getClass().getSimpleName() + " begin...");
    }

    @After
    public void afterTest() {
        System.out.println(getClass().getSimpleName()  + " finished");
    }

}
