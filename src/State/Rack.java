package State;

import java.util.ArrayList;
import java.util.List;

public class Rack {
    private int availableQuantity;
    private String name;
    private String code;
    private double price;

    public Rack(String name, String code, double price, int quantity){
        this.availableQuantity = quantity;
        this.name = name;
        this.code = code;
        this.price = price;
    }

    public boolean isProductAvailable(){
        return this.availableQuantity > 0;
    }

    public double getPrice(){
        return this.price;
    }
    public void removeProduct(){
        this.availableQuantity--;
    }
}
