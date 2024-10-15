package Decorator;

public class Cappuccino implements Coffee {
    protected Coffee decoratedCoffee;

    public Cappuccino(Coffee coffee){
        this.decoratedCoffee  = coffee;
    }

    @Override
    public String getDescription() {
        return "Cappuccino";
    }

    @Override
    public double getCost() {
        return this.decoratedCoffee.getCost() + 3.0;
    }
}
