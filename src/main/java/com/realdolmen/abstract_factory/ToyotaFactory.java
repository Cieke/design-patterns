package com.realdolmen.abstract_factory;

/**
 * Created by KVRRQ70 on 5/07/2016.
 */
class ToyotaFactory implements VehicleFactory {
    @Override
    public Car createCar(Color color, String model) {
        return new ToyotaCar(color, model);
    }

    @Override
    public Truck createTruck(int capacity) {
        return new ToyotaTruck(capacity);
    }
}
