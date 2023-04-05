package patterns.observerPattern.Observable;

import patterns.observerPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {

    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void addStocks(int newStockAdded);

    public int getStockCount();
}
