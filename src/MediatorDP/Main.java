package MediatorDP;

public class Main {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new Auction();
        Bidder bidder1=new Bidder("Rajat");
        Bidder bidder2=new Bidder("Abhay");

        auctionMediator.addBidder(bidder1);
        auctionMediator.addBidder(bidder2);
        auctionMediator.placeBid(bidder1,1000);
        auctionMediator.placeBid(bidder2,1000);

    }
}
