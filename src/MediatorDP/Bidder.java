package MediatorDP;

public class Bidder implements Colleague{
    String name;
    AuctionMediator auctionMediator;

    Bidder(String name) {
        this.name = name;
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this,bidAmount);
    }

    @Override
    public void receiveNotification(int bidAmount) {
        System.out.println("Bidder"  + name+ "received notification that someone" +"placed a bid of "+ bidAmount);
    }
}
