package Decorator;

public class CappuccinoWithChocoChips implements Coffee{
    protected Coffee decoratedCoffee;

    public CappuccinoWithChocoChips(Coffee coffee){
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return "Cappuccino with javachips";
    }

    @Override
    public double getCost() {
        return this.decoratedCoffee.getCost() + 5.0;
    }
}
