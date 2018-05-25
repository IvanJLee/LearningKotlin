package com.learning;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * test class
 *
 * @author  Ivan on 2018-05-22 23:48.
 * @version v0.1
 * @since   v1.0
 */
public class DesignPatternTestRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(
//                StrategyTest.class,
                ObserverTest.class
        );

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }




}
