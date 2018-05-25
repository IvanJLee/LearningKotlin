package com.learning.observer.v2;

import java.util.Observable;
import java.util.Observer;

/**
 * display current condition
 *
 * @author  Ivan on 2018-05-24 23:45.
 * @version v0.1
 * @since   v1.0
 */
public class CurrentConditionDisplayV2 implements Observer, DisplayElementV2 {

    private WeatherDataV2.Params params;

    @Override
    public void display() {
        System.out.println("Current condition: ");
        System.out.println("[temperature] : " + params.temperature + "˚C");
        System.out.println("[humidity]    : " + params.humidity + "%");
        System.out.println("[pressure]    : " + params.pressure + "MPa");
    }

    @Override
    public void update(Observable o, Object arg) {
        params = (WeatherDataV2.Params) arg;
        display();
    }
}
