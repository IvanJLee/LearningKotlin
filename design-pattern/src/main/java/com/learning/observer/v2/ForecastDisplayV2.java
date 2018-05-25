package com.learning.observer.v2;

import java.util.Observable;
import java.util.Observer;

/**
 * Forecast
 *
 * @author  Ivan on 2018-05-25 00:35.
 * @version v0.1
 * @since   v1.0
 */
public class ForecastDisplayV2 implements DisplayElementV2, Observer {

    private WeatherDataV2.Params params;

    @Override
    public void display() {
        System.out.println("heat index: " + computeHeatIndex(params.temperature, params.pressure));
    }

    private float computeHeatIndex(float t, float rh) {
        return (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
                (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
                (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
    }

    @Override
    public void update(Observable o, Object arg) {
        this.params = (WeatherDataV2.Params) arg;
        display();
    }
}
