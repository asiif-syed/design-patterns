package Decorator;

public class BlackCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Black Coffee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
