package com.realdolmen.abstract_factory;

public class AbstractFactoryRunner {
    public static void main(String[] args) {
        // Switch abstract_factory by simply replacing this with ToyotaFactory
        VehicleFactory factory = new AudiFactory();

        // Imagine this use being done all over the place in the entire application.
        // In that case, it would be inconvenient to replace all the 'news' by another 'new' (e.g. new AudiCar(a, b) by new ToyotaCar(a, b, c)
        Car car = factory.createCar(Color.red, "Sport");
        Truck truck = factory.createTruck(1000);
        System.out.println(car);
        System.out.println(truck);
    }
}
