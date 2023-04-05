package patterns.observerPattern.Observer;

import patterns.observerPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId, "product is in my stock hurry up");
    }

    private void sendMail(String emailId, String msg) {
        System.out.println("mail sent to : " + emailId);
        //send the actual email to the end user
    }
}
