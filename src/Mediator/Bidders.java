package Mediator;

public interface Bidders {
    public void getBiddingInfo(String bidderName, int amount );
    public void placeBid(int amount);
    public String getBidderName();
}
