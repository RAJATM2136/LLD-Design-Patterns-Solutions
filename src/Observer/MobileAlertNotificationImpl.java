package Observer;

import Observable.StocksObservable;

public class MobileAlertNotificationImpl implements NotificationAlertObserver{
    private StocksObservable stocksObservable;
    String userName;
    public MobileAlertNotificationImpl(StocksObservable stocksObservable, String userName) {
        this.stocksObservable = stocksObservable;
        this.userName = userName;
    }
    @Override
    public void update() {
        sendSMS(userName,"Product is available -Notified via Mobile");
    }
    public void sendSMS(String userName, String message){
        System.out.println("Sending SMS to "+userName+" "+message);
    }
}
