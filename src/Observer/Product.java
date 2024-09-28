package Observer;

public interface Product {
    public void registerSubscribers(Subscriber subscriber);
    public void removeSubscribers(Subscriber subscriber);
    public void notifySubscribers();
    public void addStock(int quantity);
}
