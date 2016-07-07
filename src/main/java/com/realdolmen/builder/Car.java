package com.realdolmen.builder;

import com.realdolmen.abstract_factory.Color;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private String make;
    private Color color;
    private List<Wheel> wheels = new ArrayList<>();
    private Engine engine;

    public Car(String model, String make, Color color) {
        this.model = model;
        this.make = make;
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void addWheel(Wheel wheel) {
        wheels.add(wheel);
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public Color getColor() {
        return color;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void drive() {
        engine.run();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", color=" + color +
                ", wheels=" + wheels +
                ", engine=" + engine +
                '}';
    }
}
