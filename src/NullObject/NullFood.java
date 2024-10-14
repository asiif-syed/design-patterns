package NullObject;

public class NullFood implements FoodItem {
    private int quantity;

    @Override
    public void orderFood(int quantity) {
        this.quantity = quantity;
        System.out.println("Selected food is not available");
    }

    @Override
    public void prepareFood() {
        System.out.println("Selected food is not available");
    }

    @Override
    public void deliverFood() {
        System.out.println("Selected food is not available");
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
