package be.nancy.starbuzz;

/**
 * Created by tywinlannister on 07/07/16.
 */
public class Runner {
    public static void main(String[] args) {

        Beverage beverage = new HouseBlend();
        System.out.println(beverage.getDescription()+ " price: €" + beverage.cost());


        Beverage beverage1 = new HouseBlend();
        beverage1 = new Milk(beverage1);
        System.out.println(beverage1.getDescription()+ " price: €" + beverage1.cost());

    }
}
