package com.learning.observer.v2;

import java.util.Observable;
import java.util.Observer;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * statistics
 *
 * @author  Ivan on 2018-05-25 00:06.
 * @version v0.1
 * @since   v1.0
 */
public class StatisticDisplayV2 implements DisplayElementV2, Observer {

    private Queue<Float> pastTemperature = new PriorityQueue<>(12);

    @Override
    public void display() {
        float min = pastTemperature.stream().min(Float::compare).get();
        float max = pastTemperature.stream().max(Float::compare).get();
        double average = pastTemperature.stream().mapToDouble(Float::doubleValue).average().getAsDouble();
        System.out.println("min " + min + "˚C, max " + max + "˚C, average " + average + "˚C in past 8 hours.");
    }

    private void addTemperature(float temperature) {
        if (pastTemperature.size() >= 12) {
            pastTemperature.poll();

        }
        pastTemperature.add(temperature);
    }

    @Override
    public void update(Observable o, Object arg) {
        addTemperature(((WeatherDataV2.Params) arg).temperature);
        display();
    }
}
