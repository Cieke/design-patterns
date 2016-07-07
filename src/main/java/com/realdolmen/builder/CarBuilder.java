package com.realdolmen.builder;

import com.realdolmen.abstract_factory.Color;

public class CarBuilder {
    private static final int NUMBER_OF_WHEELS_PER_CAR = 4;

    private String model;
    private String make;
    private Color paint;
    private Wheel wheelPrototype;
    private Engine engine;

    public CarBuilder paint(Color color) {
        paint = color;
        return this;
    }

    public CarBuilder mountWheels(int size, boolean alu) {
        wheelPrototype = new Wheel(size, alu);
        return this;
    }

    public CarBuilder begin(String model, String make) {
        this.make = make;
        this.model = model;
        return this;
    }

    public CarBuilder assembleEngine(int cc, String fuelType) {
        this.engine = new Engine(fuelType, cc);
        return this;
    }

    public Car finish() {
        Car car = new Car(model, make, paint);
        car.setEngine(engine);
        for(int i = 0; i < NUMBER_OF_WHEELS_PER_CAR; i++) {
            car.addWheel(wheelPrototype);
        }
        return car;
    }
}
