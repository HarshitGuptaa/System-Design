package ObserverPattern.Observable;

import ObserverPattern.Observer.*;

public interface ProductStockObservable{
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifyObservers();
    void update(int stockAdded);
    public int getStock();
}
