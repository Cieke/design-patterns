package com.realdolmen.abstract_factory;

public abstract class Truck {
    private int capacity;
    private String model;
    private String make;

    public Truck(int capacity, String model, String make) {
        this.capacity = capacity;
        this.model = model;
        this.make = make;
    }

    // Also add getters and setters

    @Override
    public String toString() {
        return "Truck{capacity=" + capacity + ", model='" + model + '\'' + ", make='" + make + '\'' + '}';
    }
}
