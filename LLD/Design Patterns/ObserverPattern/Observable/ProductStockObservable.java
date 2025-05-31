package ObserverPattern.Observable;

import java.util.*;

import ObserverPattern.Observer.*;

public interface ProductStockObservable{
    List<NotificationAlertObserver> observers = new ArrayList<>();
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifyObservers();
    void update(int stockAdded);
    public int getStock();
}
