package State;

public class IssueRefundState implements VendingMachineState{
    private VendingMachine vendingMachine;
    public IssueRefundState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
        this.display("Issuing refund!");
    }
    @Override
    public void insertMoney(double amount) {
        this.display("Refund in progress, cannot insert money now");
    }

    @Override
    public void selectProduct(String code) {
        this.display("Refund in progress, cannot select a product now");
    }

    @Override
    public void requestRefund() {
        // Issue the refund
        this.display("Refund is issued, collect your money!");
        //  Set the amount to 0
        this.vendingMachine.resetAmount(0);
        // Set selected product to null
        this.vendingMachine.setSelectedProduct(null);
        // Set the state to Idle
        this.vendingMachine.setState(new IdleState(this.vendingMachine));
    }
    @Override
    public void setOutOfStock() {
        this.display("Issuing refund, cannot change the state now!");
    }

    @Override
    public void setInStock() {
        this.display("Issuing refund, cannot change the state now!");
    }
    @Override
    public void dispenseProduct() {
        this.display("Refund in progress, cannot dispense a product now");
    }

    @Override
    public void display(String message) {
        System.out.println(message);
    }
}
