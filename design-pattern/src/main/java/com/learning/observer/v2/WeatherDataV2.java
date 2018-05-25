package com.learning.observer.v2;

import java.util.Observable;

/**
 * Weather Data
 *
 * @author  Ivan on 2018-05-24 23:18.
 * @version v0.1
 * @since   v1.0
 */
public class WeatherDataV2 extends Observable {

    public void setMeasurements(Params params) {
        setChanged();
        notifyObservers(params);
        System.out.println();
    }

    public static class Params {
        float temperature;
        float humidity;
        float pressure;

        public void setTemperature(float temperature) {
            this.temperature = temperature;
        }

        public void setHumidity(float humidity) {
            this.humidity = humidity;
        }

        public void setPressure(float pressure) {
            this.pressure = pressure;
        }
    }
}
