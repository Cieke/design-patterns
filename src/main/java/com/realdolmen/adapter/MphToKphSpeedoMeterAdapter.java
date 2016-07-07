package com.realdolmen.adapter;

public class MphToKphSpeedoMeterAdapter implements SpeedoMeter {
    public static final double KM_PER_MILE = 1.6;

    private MilesPerHourSpeedoMeter adaptee;

    public MphToKphSpeedoMeterAdapter(MilesPerHourSpeedoMeter adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int speedInKmPerHour() {
        double mph = adaptee.getSpeedInMilesPerHour();
        int kph = (int) Math.round(mph * KM_PER_MILE);
        return kph;
    }
}
