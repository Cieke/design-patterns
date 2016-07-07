package com.realdolmen.proxy;

public class ControlledInjectionEngineProxy implements Engine {
    private Engine realEngine;

    public ControlledInjectionEngineProxy(Engine realEngine) {
        this.realEngine = realEngine;
    }

    @Override
    public void injectFuel(int amount) {

        // Do some stuff before
        // Anything goes here!
        int newAmount = Math.min(100, amount);

        realEngine.injectFuel(newAmount);


        // Do some stuff after

    }
}
