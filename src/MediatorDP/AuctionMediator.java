package MediatorDP;

public interface AuctionMediator {
    public void addBidder(Colleague bidder);
    public void placeBid(Colleague colleague,int bidAmount);
}
