package com.realdolmen.builder;

public class Engine {
    private String fuelType;
    private int cc;

    public Engine(String fuelType, int cc) {
        this.fuelType = fuelType;
        this.cc = cc;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getCc() {
        return cc;
    }

    public void run() {
        System.out.println("Broem broem!");
    }

    @Override
    public String toString() {
        return "Engine{" +
                "fuelType='" + fuelType + '\'' +
                ", cc=" + cc +
                '}';
    }
}
