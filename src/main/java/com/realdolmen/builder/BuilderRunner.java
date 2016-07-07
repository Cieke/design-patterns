package com.realdolmen.builder;

import com.realdolmen.abstract_factory.Color;

/**
 * Using the examples you should imagine the case to be much more complex.
 * For simple illustrations that work well for explaining the concepts, it is often a
 * bit 'overkill' to use the demonstrated pattern. When projecting this solution to a more
 * complex case however, you can imagine that the balance flips over to the other side
 * where using the pattern is actually less complex than not using it.
 * In other words: adding a design pattern often means an additional overhead, which
 * only starts paying off when the benefits of the improved architecture are higher than
 * this extra overhead.
 */
public class BuilderRunner {
    public static void main(String[] args) {
        // Director here is the "main" itself.
        // Could also be a separate class on it's own that has a "construct()" method.

        // This example uses a "fluent-api" in combination with a builder. An often encountered combination.
        Car c2 = new CarBuilder()
            .begin("A3", "Audi")
            .paint(Color.green)
            .mountWheels(19, true)
            .assembleEngine(1600, "Diesel")
            .finish(); // aka "getResult()"
        System.out.println(c2);
    }
}
