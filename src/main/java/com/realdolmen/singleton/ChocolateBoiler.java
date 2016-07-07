package com.realdolmen.singleton;

/**
 * This example comes from the excellent book: "Head First Design Patterns"
 */
public class ChocolateBoiler {
    private static ChocolateBoiler instance;

    /**
     * Singletons have a private constructor
     */
    private ChocolateBoiler() {
    }

    /**
     * Singleton instantiation method will only "new" a boiler when this is called for the first time (note both method "getInstance()" and field "instance" are static)
     */
    public static ChocolateBoiler getInstance() {
        if(instance == null) {
            // Only the first time
            instance = new ChocolateBoiler();
        }
        // All times
        return instance;
    }

    public void fill(String stuff) {
        System.out.println("Filling boiler with " + stuff);
    }
}
