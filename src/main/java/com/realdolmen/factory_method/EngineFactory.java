package com.realdolmen.factory_method;

public class EngineFactory {
    /**
     * This is a factory method.
     * Some supposed complexity involved in "new"-ing the engine.
     * One might argue that this "logic" should be present in the constructor of Engine itself. While true in some cases
     * it might in some other cases not be desirable nor possible to do so:
     * - the engine class might be coming from another (maven) dependency and is not editable by the programmer here
     * - in some other cases this logic for an engine may not apply exactly, thus we don't want to pin our engine class down to this specific usecase
     */
    public Engine createEngine(int cc, String fuelType) {
        boolean turbo = false;
        // Serious...
        boolean valves = cc % 100 == 0;
        String ignition = "Mechanic";
        if(cc > 2000) {
            turbo = true;
        }
        // ... mumbo ...
        if(fuelType.equals("Diesel")) {
            ignition = "Electronic";
        } else if(valves) {
            ignition = "Digital";
            // ... jumbo ...
        }

        Engine engine;
        if(fuelType.equals("Diesel")) {
            engine = new DieselEngine(cc, turbo);
        } else {
            engine = new Engine(cc, fuelType, turbo);
        }

        // ... complex ...
        engine.setIgnition(ignition);
        engine.setValves(valves);
        // ... code
        engine.setTurbo(turbo);
        return engine; // ... potato.
    }
}
