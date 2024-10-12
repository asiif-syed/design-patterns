package Template;

public class PreparePasta extends PrepareOrderedFood{
    private String foodName ;
    public PreparePasta(){
        super();
        this.foodName = "Pasta";
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
