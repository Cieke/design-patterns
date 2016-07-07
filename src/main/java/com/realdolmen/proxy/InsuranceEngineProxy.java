package com.realdolmen.proxy;

public class InsuranceEngineProxy implements Engine {
    private Engine engine;

    public InsuranceEngineProxy(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void injectFuel(int amount) {
        System.out.println("LOGGING TO DATABASE ACCELERATION OF " + amount);
        engine.injectFuel(amount);
    }
}
