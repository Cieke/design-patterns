package com.realdolmen.singleton;

public class ChocolateBoilerRunner {
    public static void main(String[] args) {

        // new ChocolateBoiler() is not possible due to private constructor!
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill("choco");

        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
        if(boiler == boiler2) {
            System.out.println("It's the same!");
        } else {
            System.out.println("It is not the same");
        }
    }
}
