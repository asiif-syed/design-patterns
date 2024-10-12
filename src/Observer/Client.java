package Observer;

public class Client {
    public static void main(String[] args){
        Product iphone = new Iphone(100);
        Subscriber emailSubscriber = new EmailSubscriber();
        Subscriber phoneSubscriber = new PhoneSubscriber();

        iphone.registerSubscribers(emailSubscriber);
        iphone.registerSubscribers(phoneSubscriber);

        iphone.addStock(100);
    }
}
