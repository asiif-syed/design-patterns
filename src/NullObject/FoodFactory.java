package NullObject;

public class FoodFactory {

    public FoodItem getFoodObject(String name){
        if(name == "Pizza"){
            return new Pizza();
        } else if(name == "Pasta"){
            return new Pasta();
        }
        return new NullFood();
    }
}
