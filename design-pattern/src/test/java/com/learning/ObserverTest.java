package com.learning;

import com.learning.observer.v1.CurrentConditionDisplay;
import com.learning.observer.v1.ForecastDisplay;
import com.learning.observer.v1.StatisticDisplay;
import com.learning.observer.v1.WeatherData;

import org.junit.Test;

import java.util.Random;
import java.util.stream.Stream;

/**
 * Ivan
 *
 * @author  Ivan on 2018-05-25 23:00.
 * @version v0.1
 * @since   v1.0
 */
public class ObserverTest {

    @Test
    public void observerV1() {
        WeatherData data = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();
        StatisticDisplay statisticDisplay = new StatisticDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        data.registerObserver(currentConditionDisplay);
        data.registerObserver(statisticDisplay);
        data.registerObserver(forecastDisplay);

        Stream.iterate(new Random[]{new Random(), new Random(), new Random()}, var -> new Random[]{new Random(), new Random(), new Random()})
                .limit(18)
                .map(random -> {
                    WeatherData.Params params = new WeatherData.Params();
                    params.setTemperature((random[0].nextInt(25) + 15));
                    params.setHumidity(random[1].nextInt(50) + 30);
                    params.setPressure((float) ((random[2].nextInt(10) + 95) % 105 * 0.001));
                    return params;
                })
                .forEach(data::setMeasurements);

    }
}
