package be.nancy.charlie.factory;

/**
 * Created by tywinlannister on 05/07/16.
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;

    }
    public static ChocolateBoiler getInstance(){
        if (uniqueInstance == null){
            System.out.println("unique instance of CB");
            uniqueInstance = new ChocolateBoiler();
        }
        System.out.println("instance of CB");
        return  uniqueInstance;
    }
    public void fill(){
        if (isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()){
            empty = true;
        }
    }

    public void boil(){
        if (!isEmpty() && isBoiled()){
            empty = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
