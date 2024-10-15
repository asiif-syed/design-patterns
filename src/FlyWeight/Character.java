package FlyWeight;

public class Character implements CharacterFlyWeight{
    private char symbol; // Intrinsic state, shared between objects
    private String name;
    public Character(char symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    @Override
    public void display(int size, String color) {
        System.out.println("Character: " + symbol + ", Size: " + size + ", Color: " + color);
    }
}
