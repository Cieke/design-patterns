package com.realdolmen.factory_method;

public class DieselEngine extends Engine {
    public DieselEngine(int cc, boolean turbo) {
        super(cc, "Diesel", turbo);
    }
}
