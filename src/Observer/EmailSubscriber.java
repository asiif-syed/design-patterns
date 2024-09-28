package Observer;

public class EmailSubscriber implements  Subscriber{
    @Override
    public void update() {
        System.out.println("Updating subscriber via email");
    }
}
