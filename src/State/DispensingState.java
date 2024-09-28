package State;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DispensingState implements VendingMachineState{
    private VendingMachine vendingMachine;
    private String selectedProductName;
    public DispensingState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
        this.selectedProductName = this.vendingMachine.getSelectedProductName();
        this.display("Dispensing Product: " + this.selectedProductName);
    }
    @Override
    public void insertMoney(double amount) {
        this.display("Dispensing Product, cannot insert money now!");
    }

    @Override
    public void selectProduct(String code) {
        this.display("Dispensing Product, cannot select product now!");
    }

    @Override
    public void requestRefund() {
        this.display("Dispensing Product, cannot cancel the purchase now!");
    }

    @Override
    public void setOutOfStock() {
        this.display("Dispensing Product, cannot change the state now!");
    }

    @Override
    public void setInStock() {
        this.display("Dispensing Product, cannot change the state now!");
    }
    @Override
    public void dispenseProduct() {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        executorService.schedule(() -> {
            this.display("Please collect your Product " + this.selectedProductName + "!");
           Rack selectedProduct = this.vendingMachine.getSelectedProduct();
           selectedProduct.removeProduct();
            this.vendingMachine.setSelectedProduct(null);
            this.vendingMachine.resetAmount(0);
            this.vendingMachine.setState(new IdleState(this.vendingMachine));
        }, 2, TimeUnit.SECONDS);
        // Optionally, shut down the executor service after the task is executed
        executorService.shutdown();
    }

    @Override
    public void display(String message) {
        System.out.println(message);
    }
}
