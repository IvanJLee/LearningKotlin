package com.learning;

import com.learning.observer.v1.CurrentConditionDisplay;
import com.learning.observer.v1.ForecastDisplay;
import com.learning.observer.v1.StatisticDisplay;
import com.learning.observer.v1.WeatherData;
import com.learning.observer.v2.CurrentConditionDisplayV2;
import com.learning.observer.v2.ForecastDisplayV2;
import com.learning.observer.v2.StatisticDisplayV2;
import com.learning.observer.v2.WeatherDataV2;

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
                    params.setPressure((float) ((random[2].nextInt(5) + 98) * 0.001));
                    return params;
                })
                .forEach(data::setMeasurements);

    }

    @Test
    public void observerV2() {
        WeatherDataV2 data = new WeatherDataV2();
        CurrentConditionDisplayV2 currentConditionDisplay = new CurrentConditionDisplayV2();
        StatisticDisplayV2 statisticDisplay = new StatisticDisplayV2();
        ForecastDisplayV2 forecastDisplay = new ForecastDisplayV2();
        data.addObserver(currentConditionDisplay);
        data.addObserver(statisticDisplay);
        data.addObserver(forecastDisplay);

        Stream.iterate(new Random[]{new Random(), new Random(), new Random()}, var -> new Random[]{new Random(), new Random(), new Random()})
                .limit(18)
                .map(random -> {
                    WeatherDataV2.Params params = new WeatherDataV2.Params();
                    params.setTemperature((random[0].nextInt(25) + 15));
                    params.setHumidity(random[1].nextInt(50) + 30);
                    params.setPressure((float) ((random[2].nextInt(5) + 98)* 0.001));
                    return params;
                })
                .forEach(data::setMeasurements);

    }

}
