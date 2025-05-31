package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

public class IphoneStockObservable implements ProductStockObservable{

    int stock;

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
        if(stock==0){
            notifyObservers();
        }
        stock+=stockAdded;
    }

    @Override
    public int getStock() {
        return stock;
    }
    
}
