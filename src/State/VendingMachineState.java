package State;

public interface VendingMachineState{
    public void insertMoney(double amount);
    public void selectProduct(String code);
    public void dispenseProduct();
    public void requestRefund();
    public void setOutOfStock();
    public void setInStock();
    public void display(String message);
}
