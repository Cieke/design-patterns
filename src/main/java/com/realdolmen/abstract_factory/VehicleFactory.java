package com.realdolmen.abstract_factory;

public interface VehicleFactory {
    Car createCar(Color color, String model);
    Truck createTruck(int capacity);
}

