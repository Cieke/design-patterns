package be.nancy.charlie.factory;

/**
 * Created by tywinlannister on 05/07/16.
 */
public class ChocolateRunner {
    public static void main(String args[]) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();


        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
    }
}
