package Template;

public class Client {
    public static void main(String[] args){
        PrepareOrderedFood preparePizza = new PreparePizza();
        PrepareOrderedFood preparePasta = new PreparePasta();
        preparePizza.prepareMeal(2);
        preparePasta.prepareMeal(3);
    }
}
