package be.nancy.starbuzz;

/**
 * Created by tywinlannister on 07/07/16.
 */
public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage){
        this.component = beverage;
    }
    public String getDescription(){
        return component.getDescription() +" with Milk";
    }

    public double cost(){
        return .50 + component.cost();
    }
}
