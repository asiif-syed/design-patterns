package State;

public class OutOfStockState implements VendingMachineState{
    private VendingMachine vendingMachine;
    public OutOfStockState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
        this.display("Vending Machine is out of stock, use another machine!");
    }
    @Override
    public void insertMoney(double amount) {
        this.display("Vending Machine is out of stock, use another machine!");
    }

    @Override
    public void selectProduct(String code) {
        this.display("Vending Machine is out of stock, use another machine!");
    }

    @Override
    public void requestRefund() {
        this.display("Vending Machine is out of stock, use another machine!");
    }

    @Override
    public void dispenseProduct() {
        this.display("Vending Machine is out of stock, use another machine!");
    }

    @Override
    public void setOutOfStock() {
        this.display("Vending Machine is out of stock, use another machine!");
    }

    @Override
    public void setInStock() {
        this.vendingMachine.setState(new IdleState(this.vendingMachine));
    }

    @Override
    public void display(String message) {
        this.display("Vending Machine is out of stock, use another machine!");
    }


}

