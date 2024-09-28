package Strategy;

public class PaypalPayment implements PaymentService {
    @Override
    public void pay(int amount) {
        System.out.println("Paying through Paypal");
    }
}
