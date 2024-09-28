package State;

public class HasMoneyState implements VendingMachineState{
    private VendingMachine vendingMachine;
    public HasMoneyState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
        this.display("Select Product!");
    }
    @Override
    public void insertMoney(double amount) {
        this.vendingMachine.setCurrentBalance(amount);
        double availableBalance = this.vendingMachine.getCurrentBalance();
        this.display("Available amount: " + availableBalance);
    }

    @Override
    public void selectProduct(String code) {
        this.display("Selected product" + code);
        this.vendingMachine.setSelectedProduct(code);
        Rack productDetails = this.vendingMachine.getSelectedProduct();
//        Check if the code is valid
//        Check if the product is in-stock
//        Check if the balance is sufficient
//        Change the state to Dispensing
        if(productDetails == null){
            this.display("Invalid code!");
        } else if(!productDetails.isProductAvailable()){
            this.display("Product is out of stock, please select another product!");
        } else if(productDetails.getPrice() > this.vendingMachine.getCurrentBalance()){
            this.display("Insufficient balance, please select another product!");
        } else{
            this.vendingMachine.setState(new DispensingState(this.vendingMachine));
            this.vendingMachine.dispenseProduct();
        }

    }

    @Override
    public void requestRefund() {
        this.vendingMachine.setState(new IssueRefundState(this.vendingMachine));
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
        this.display("Select a product");
    }
    @Override
    public void dispenseProduct() {
        this.display("Select a product first!");
    }

    @Override
    public void display(String message) {
        System.out.println(message);
    }
}
