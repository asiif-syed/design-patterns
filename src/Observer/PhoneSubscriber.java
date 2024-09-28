package Observer;

public class PhoneSubscriber implements Subscriber{
    @Override
    public void update() {
        System.out.println("Updating subscriber via phone");
    }
}
