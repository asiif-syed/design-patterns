package Strategy;

import Singleton.Singleton;

public class Client {
    public static void main(String[] args) {
        CreditCarPayment paymentService = new CreditCarPayment();
        ShoppingCart cart = new ShoppingCart();
        cart.checkout(100, paymentService);
    }
}
