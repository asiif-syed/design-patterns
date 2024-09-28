package Strategy;

public class DebitCardPayment implements PaymentService{
    @Override
    public void pay(int amount) {
        System.out.println("Paying through debit card");
    }
}
