package com.realdolmen.adapter;

public class Car {
    private SpeedoMeter speedoMeter;

    public Car(SpeedoMeter speedoMeter) {
        this.speedoMeter = speedoMeter;
    }

    public int getSpeed() {
        return speedoMeter.speedInKmPerHour();
    }
}
