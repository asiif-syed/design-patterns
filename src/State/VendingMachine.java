package State;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private VendingMachineState currentState;
    private double currentBalance;
    private String selectedItem;
    private Map<String, Rack> inventory;

    public VendingMachine(){
        this.currentBalance = 0;
        this.selectedItem = null;
        this.fillUpInventory();
        this.currentState = new IdleState(this);
    }

    private void fillUpInventory(){
       this.inventory = new HashMap<String, Rack>(10);
       this.inventory.put("100", new Rack("Coke", "100", 10, 5));
       this.inventory.put("101", new Rack("Pepsi", "101", 10, 5));
       this.inventory.put("102", new Rack("Iced Tea", "102", 10, 5));
       this.inventory.put("103", new Rack("Iced Coffee", "103", 10, 0));
       this.inventory.put("104", new Rack("Gum", "104", 10, 5));
       this.inventory.put("105", new Rack("Energy Drink", "105", 10, 5));
       this.inventory.put("106", new Rack("Dark Chocolate", "106", 10, 5));
       this.inventory.put("107", new Rack("White Chocolate", "107", 10, 5));
       this.inventory.put("108", new Rack("Protein Bar", "108", 10, 5));
       this.inventory.put("109", new Rack("Cookies", "109", 10, 0));
    }

    public void insertMoney(double amount){
        this.currentState.insertMoney(amount);
    }

    public void selectProduct(String code){
        this.currentState.selectProduct(code);
    }

    public void requestRefund(){
        this.currentState.requestRefund();
    }

    public void dispenseProduct(){
        this.currentState.dispenseProduct();
    }

    public  void setOutOfStock(){
        this.currentState.setOutOfStock();
    }

    public  void setInStock(){
        this.currentState.setInStock();
    }

    public void display(String message){
        this.currentState.display(message);
    }

    public void setState(VendingMachineState state){
        this.currentState = state;
    }
    public double getCurrentBalance(){
        return this.currentBalance;
    }
    public void setCurrentBalance(double amount){
        this.currentBalance += amount;
    }

    public void resetAmount(double amount){
        this.currentBalance = amount;
    }

    public Rack getSelectedProduct(){
        return this.inventory.get(this.selectedItem);
    }

    public String getSelectedProductName(){
        return this.selectedItem;
    }

    public void setSelectedProduct(String code){
         this.selectedItem = code;
    }
}
