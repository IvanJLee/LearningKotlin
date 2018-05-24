package com.learning.observer.v1;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * statistics
 *
 * @author  Ivan on 2018-05-25 00:06.
 * @version v0.1
 * @since   v1.0
 */
public class StatisticDisplay implements DisplayElement, Observer<WeatherData.Params> {

    private Queue<Float> pastTemperature = new PriorityQueue<>(12);

    @Override
    public void display() {
        float min = pastTemperature.stream().min(Float::compare).get();
        float max = pastTemperature.stream().max(Float::compare).get();
        double average = pastTemperature.stream().mapToDouble(Float::doubleValue).average().getAsDouble();
        System.out.println("min " + min + "˚F, max " + max + "˚F, average " + average + "˚F in past 8 hours.");
    }

    @Override
    public void onDataChange(WeatherData.Params params) {
        addTemperature(params.temperature);
    }

    private void addTemperature(float temperature) {
        if (pastTemperature.size() >= 12) {
            pastTemperature.poll();

        }
        pastTemperature.add(temperature);
    }
}
