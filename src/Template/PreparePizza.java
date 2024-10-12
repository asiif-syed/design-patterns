package Template;

public class PreparePizza extends PrepareOrderedFood{
    public PreparePizza(){
        super();
        this.foodName = "Pizza";
    }
    @Override
    void gatherIngredients() {
        System.out.println("Gathering ingredients to prepare " + this.orderedQuantity + " " + this.foodName + "(s)");
    }

    @Override
    void cookFood() {
        System.out.println("Cooking " + this.foodName);
    }

    @Override
    void serveFood() {
        System.out.println("Serving " + this.foodName);
    }
}
