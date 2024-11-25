package MediatorDP;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator{
    List<Colleague> colleagueList=new ArrayList<>();

    @Override
    public void addBidder(Colleague bidder) {
        colleagueList.add(bidder);
    }

    @Override
    public void placeBid(Colleague colleague, int bidAmount) {
        for(Colleague c:colleagueList){
            if(!c.equals(colleague)){
                c.receiveNotification(bidAmount);
            }
        }
    }
}
