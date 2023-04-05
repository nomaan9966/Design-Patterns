package patterns.observerPattern;

import patterns.observerPattern.Observable.IphoneObservableImpl;
import patterns.observerPattern.Observable.StocksObservable;
import patterns.observerPattern.Observer.EmailAlertObserverImpl;
import patterns.observerPattern.Observer.MobileAlertObserverImpl;
import patterns.observerPattern.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {
        StocksObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("user1@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("user2@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("user3gmail.com", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.addStocks(10);
    }
}
