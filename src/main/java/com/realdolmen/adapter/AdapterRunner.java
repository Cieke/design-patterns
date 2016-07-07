package com.realdolmen.adapter;

public class AdapterRunner {
    public static void main(String[] args) {

        SpeedoMeter s = new MphToKphSpeedoMeterAdapter(new MilesPerHourSpeedoMeter());

        Car car = new Car(s);
        System.out.println(car.getSpeed());
    }
}
