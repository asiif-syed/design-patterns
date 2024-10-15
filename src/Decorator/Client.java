package Decorator;

public class Client {
    public static void main(String[] args){
        Coffee coffee = new BlackCoffee();
//        Make cappuccino
        coffee = new Cappuccino(coffee);
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());
//        Add JavaChip
        coffee = new CappuccinoWithChocoChips(coffee);
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());
    }
}
