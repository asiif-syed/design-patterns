package Strategy;

public class ShoppingCart {
    public void checkout(int amount, PaymentService paymentService){
        paymentService.pay(amount);
    }
}
