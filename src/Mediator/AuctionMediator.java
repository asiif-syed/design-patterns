package Mediator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AuctionMediator implements Mediator {
    private List<Bidders> biddersList;

    public AuctionMediator(){
        this.biddersList = new ArrayList<Bidders>();
    }

    @Override
    public void addBidder(Bidders bidder){
        this.biddersList.add(bidder);
    }

    @Override
    public void receiveBid(String bidderName, int amount){
        if(biddersList.size() == 0){
            System.out.println("No bidders are registered!");
        } else {
            for(Bidders bidder: biddersList){
                if(bidder.getBidderName() != bidderName){
                    bidder.getBiddingInfo(bidderName, amount);
                }
            }
        }

    }
}
