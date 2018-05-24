package com.learning.observer.v1;

/**
 * display current condition
 *
 * @author  lijun on 2018-05-24 23:45.
 * @version v0.1
 * @since   v1.0
 */
public class CurrentConditionDisplay implements Observer<WeatherData.Params>, DisplayElement {

    private WeatherData.Params params;

    @Override
    public void onDataChange(WeatherData.Params params) {
        this.params = params;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current condition: ");
        System.out.println("[temperature] : " + params.temperature + "˚F");
        System.out.println("[humidity]    : " + params.humidity + "%");
        System.out.println("[pressure]    : " + params.pressure + "MPa");
        System.out.println();

    }
}
