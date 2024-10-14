package NullObject;

public class Pasta implements FoodItem {
    private int quantity;
    private String food = "Pasta";

    @Override
    public void orderFood(int quantity) {
        this.quantity = quantity;
        System.out.println("Order is placed for " + quantity + "  " + this.food);
    }

    @Override
    public void prepareFood() {
        System.out.println("Preparing " + quantity + "  " + this.food);
    }

    @Override
    public void deliverFood() {
        System.out.println("Delivered " + quantity + "  " + this.food);
    }
    @Override
    public boolean isNull() {
        return false;
    }
}
