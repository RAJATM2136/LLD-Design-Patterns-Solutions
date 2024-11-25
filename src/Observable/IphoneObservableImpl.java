package Observable;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{
    List<NotificationAlertObserver> notificationAlertObserverList=new ArrayList<>();
    int stockCount=0;
    @Override
    public void add(NotificationAlertObserver obj) {
        notificationAlertObserverList.add(obj);
    }

    @Override
    public void remove(NotificationAlertObserver obj) {
        notificationAlertObserverList.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for(NotificationAlertObserver notificationAlertObserver : notificationAlertObserverList){
            notificationAlertObserver.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if(stockCount==0) {
            notifyObservers();
        }
        stockCount=newStockCount;
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }
}
