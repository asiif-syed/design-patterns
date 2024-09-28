package Observer;

import java.util.ArrayList;
import java.util.List;

public class Iphone implements Product{
    private List<Subscriber> subscribers;
    private int availableQuantity;

    public Iphone(int availableQuantity){
        this.availableQuantity = availableQuantity;
        this.subscribers = new ArrayList<Subscriber>();
    }

    @Override
    public void registerSubscribers(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
    @Override
    public void removeSubscribers(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
    @Override
    public void notifySubscribers() {
        for(Subscriber s : subscribers){
            s.update();
        }
    }

    public void addStock(int quantity){
        if((this.availableQuantity == 0) && (quantity > 0)){
            this.notifySubscribers();
        }
        availableQuantity = quantity;
    }
}
