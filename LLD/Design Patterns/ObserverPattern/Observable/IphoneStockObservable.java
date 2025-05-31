package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;
import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements ProductStockObservable{

    int stock;
    private List<NotificationAlertObserver> observers = new ArrayList<>();

    @Override
    public void add(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(NotificationAlertObserver observer:observers){
            observer.sendNotification();
        }
    }

    @Override
    public void update(int stockAdded) {
        stock += stockAdded;
        if(stock > 0) {
            notifyObservers();
        }
    }

    @Override
    public int getStock() {
        return stock;
    }
    
}
