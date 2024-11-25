package Observer;

import Observable.StocksObservable;

public class EmailAlertNotificationImpl implements NotificationAlertObserver{
    private StocksObservable stocksObservable;
    String emailId;
    public EmailAlertNotificationImpl(StocksObservable stocksObservable, String emailId) {
        this.stocksObservable = stocksObservable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendMail(emailId,"Product is available -Notified via email");
    }
    public void sendMail(String emailId, String message) {
        System.out.println("Sending email to " + emailId+" "+message);
    }
}
