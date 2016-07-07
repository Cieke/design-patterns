package com.realdolmen.proxy;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    /**
     *
     * @param acceleration value from 0..1
     */
    void drive(int acceleration) {
        engine.injectFuel(acceleration * 250);
    }
}
