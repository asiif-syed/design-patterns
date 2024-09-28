package State;

public class IdleState implements VendingMachineState{
    private VendingMachine vendingMachine;
    public IdleState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
        this.display("Insert money!");
    }
    @Override
    public void insertMoney(double amount) {
        this.vendingMachine.setCurrentBalance(amount);
        double availableBalance = this.vendingMachine.getCurrentBalance();
        this.display("Available amount: " + availableBalance);
        this.vendingMachine.setState(new HasMoneyState(this.vendingMachine));
    }

    @Override
    public void selectProduct(String code) {
        this.display("Insert amount first!");
    }

    @Override
    public void requestRefund() {
        this.display("Amount is not inserted to refund!");
    }

    @Override
    public void dispenseProduct() {
        this.display("Insert amount first!");
    }
    @Override
    public void setOutOfStock() {
        double amountAvailable = this.vendingMachine.getCurrentBalance();
        if(amountAvailable > 0){
            this.vendingMachine.setState(new IssueRefundState(this.vendingMachine));
            this.vendingMachine.requestRefund();
        }
        this.vendingMachine.setState(new OutOfStockState(this.vendingMachine));
    }

    @Override
    public void setInStock() {
        this.display("Insert money!");
    }
    @Override
    public void display(String message) {
        System.out.println(message);
    }
}
