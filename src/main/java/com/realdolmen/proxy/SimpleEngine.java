package com.realdolmen.proxy;

public class SimpleEngine implements Engine {
    public void injectFuel(int amount) {
        System.out.println("Injecting " + amount + " fuel");
        if(amount > 100) {
            throw new EngineIfFloodedException("Too much fuel");
        }
    }
}
