package Observable;

import Observer.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver obj);
    public void remove(NotificationAlertObserver obj);
    public void notifyObservers();
    public void setStockCount(int newStockCount);
    public int getStockCount();
}
