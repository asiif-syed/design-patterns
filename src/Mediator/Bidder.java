package Mediator;

public class Bidder implements Bidders{
    private String bidderName;
    private Mediator auctionMediator;

    public Bidder (String name, Mediator auctionMediator){
        this.bidderName = name;
        this.auctionMediator = auctionMediator;
    }

    @Override
    public void getBiddingInfo(String name, int amount ) {
        System.out.println(this.bidderName + ": " + name + " placed a bid for " + amount);
    }

    @Override
    public void placeBid(int amount) {
        this.auctionMediator.receiveBid(this.bidderName, amount);
    }

    @Override
    public String getBidderName() {
        return this.bidderName;
    }
}
