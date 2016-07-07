package com.realdolmen.factory_method;

public class FactoryMethodRunner {
    public static void main(String[] args) {
        // The client does not need to know or care about the complexitiy
        // involved in creating an engine, because he/she can use this convenient factory which encapsulated all of that.

        EngineFactory factory = new EngineFactory(); // Could also be implemented as a singleton
        Engine engine = factory.createEngine(1600, "Diesel");
        engine.run();
    }
}
