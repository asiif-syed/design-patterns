package NullObject;

public class Client {
    public static void main(String[] args){
        FoodFactory foodFactory = new FoodFactory();
        FoodItem orderOne = foodFactory.getFoodObject("Pizza");
        FoodItem orderTwo = foodFactory.getFoodObject("Biryani");
        FoodItem orderThree = foodFactory.getFoodObject("Pasta");

//       Ordering food
        orderOne.orderFood(2);
        orderTwo.orderFood(3);
        orderThree.orderFood(1);
//        Preparing food
        orderOne.prepareFood();
        orderTwo.prepareFood();
        orderThree.prepareFood();
//        Delivering food
        orderOne.deliverFood();
        orderTwo.deliverFood();
        orderThree.deliverFood();

    }
}
