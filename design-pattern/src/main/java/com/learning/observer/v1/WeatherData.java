package com.learning.observer.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * Weather Data
 *
 * @author  Ivan on 2018-05-24 23:18.
 * @version v0.1
 * @since   v1.0
 */
public class WeatherData implements Subject<WeatherData.Params> {

    private List<Observer<Params>> observers;
    private Params params;

    @Override
    public void registerObserver(Observer<Params> observer) {
        if (observers == null) {
            observers = new ArrayList<>();
        }
    }

    @Override
    public void unregisterObserver(Observer<Params> observer) {
        if (observers != null) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserves() {
        for (Observer<Params> observer: observers){
            observer.onDataChange(params);
        }
    }

    public void setMeasurements(Params params) {
        this.params = params;
        notifyObserves();
    }

    static class Params {
        float temperature;
        float humidity;
        float pressure;
    }
}
