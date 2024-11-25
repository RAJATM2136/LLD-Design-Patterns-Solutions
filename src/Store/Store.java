package Store;

import Observable.IphoneObservableImpl;
import Observable.StocksObservable;
import Observer.EmailAlertNotificationImpl;
import Observer.MobileAlertNotificationImpl;
import Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneObservable=new IphoneObservableImpl();
        NotificationAlertObserver observer1=new EmailAlertNotificationImpl(iphoneObservable,"rajat@g.com");
        NotificationAlertObserver observer2=new EmailAlertNotificationImpl(iphoneObservable,"rajatmishra2@g.com");
        NotificationAlertObserver observer3=new MobileAlertNotificationImpl(iphoneObservable,"rajatm21236");
        NotificationAlertObserver observer4=new MobileAlertNotificationImpl(iphoneObservable,"newrajatm213341");
        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);
        iphoneObservable.add(observer4);

        iphoneObservable.setStockCount(10);
        iphoneObservable.setStockCount(0);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        iphoneObservable.setStockCount(100);
    }
}
