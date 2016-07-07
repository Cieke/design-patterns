package com.realdolmen.proxy;

public class ProxyRunner {
    /**
     * Imaginge this is the driver acting on the car
     * @param args
     */
    public static void main(String[] args) {
        Engine  engine = new InsuranceEngineProxy(
                new ControlledInjectionEngineProxy(
                        new SimpleEngine()
                )
        );

        Car car = new Car(engine);
        car.drive(1);
    }
}
