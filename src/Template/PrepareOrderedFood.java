package Template;

public abstract class PrepareOrderedFood {
    protected int orderedQuantity;
    protected String foodName;
    public void takeOrder(int quantity){
        this.orderedQuantity = quantity;
        System.out.println("Order received for " + this.orderedQuantity + " " + this.foodName + "(s)");
    }
    public void notifyKitchen(){
        System.out.println("Dear chef, we received an order for " + this.orderedQuantity + " " + this.foodName + "(s)");
    }
    // The child classes should provide an implementation
    abstract void gatherIngredients();
    abstract void cookFood();
    abstract void serveFood();

    public final void prepareMeal(int quantity){
        takeOrder(quantity);
        notifyKitchen();
        gatherIngredients();
        cookFood();
        serveFood();
    }
}
