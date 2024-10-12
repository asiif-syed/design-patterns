package Mediator;

public class Client {
    public static void main(String[] args){
//        Create auction mediator
        Mediator auctionMediator = new AuctionMediator();

//        Create bidders
        Bidders bidderOne = new Bidder("Bidder One", auctionMediator);
        Bidders bidderTwo = new Bidder("Bidder Two", auctionMediator);
        Bidders bidderThree = new Bidder("Bidder Three", auctionMediator);

//        Register bidders with auction mediator
        auctionMediator.addBidder(bidderOne);
        auctionMediator.addBidder(bidderTwo);
        auctionMediator.addBidder(bidderThree);

//      Place bids
        bidderOne.placeBid(1000);
        bidderTwo.placeBid(2000);
        bidderThree.placeBid(3000);
    }
}
