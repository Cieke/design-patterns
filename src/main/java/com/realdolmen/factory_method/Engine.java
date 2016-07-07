package com.realdolmen.factory_method;

/**
 * Suppose this class has some complicated way to instantiate it correctly.
 * It may:
 * - require other dependencies that are not obvious
 * - have zillions of parameters
 * - require some calculations to be done prior to 'new'
 * - ...
 * In other words it is generally inconvenient for the client to "new" the class itself.
 */
public class Engine {
    private int cc;
    private String fuelType;
    private boolean turbo;
    private boolean valves;
    private String ignition;

    /**
     * Insane complexity: some properties must be set using setters and some others using the constructor. It's crazy!
     */
    public Engine(int cc, String fuelType, boolean turbo) {
        this.cc = cc;
        this.fuelType = fuelType;
        this.turbo = turbo;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    public boolean isValves() {
        return valves;
    }

    public void setValves(boolean valves) {
        this.valves = valves;
    }

    public String getIgnition() {
        return ignition;
    }

    public void setIgnition(String ignition) {
        this.ignition = ignition;
    }

    public void run() {
        System.out.println("Running engine with properties: " + toString());
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cc=" + cc +
                ", fuelType='" + fuelType + '\'' +
                ", turbo=" + turbo +
                ", valves=" + valves +
                ", ignition='" + ignition + '\'' +
                '}';
    }
}
