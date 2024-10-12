package Mediator;

public interface Mediator {
    public void addBidder(Bidders bidder);
    public void receiveBid(String bidderName, int amount);
}
