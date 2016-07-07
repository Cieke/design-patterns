package be.nancy.starbuzz;

/**
 * Created by tywinlannister on 07/07/16.
 */
public abstract class Beverage {
        public String description;

    public String getDescription() {
        return description;
    }

    abstract double cost();
}
