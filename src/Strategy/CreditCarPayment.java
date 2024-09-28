package Strategy;

public class CreditCarPayment implements PaymentService{
    @Override
    public void pay(int amount) {
        System.out.println("Paying through credit card");
    }
}
