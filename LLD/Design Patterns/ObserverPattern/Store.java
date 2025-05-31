package ObserverPattern;

import ObserverPattern.Observable.IphoneStockObservable;
import ObserverPattern.Observable.ProductStockObservable;
import ObserverPattern.Observer.EmailAlertObserver;
import ObserverPattern.Observer.SMSAlertObserver;

public class Store {
    public static void main(String[] args) {
        ProductStockObservable productStockObservable = new IphoneStockObservable();
        productStockObservable.add(new EmailAlertObserver(productStockObservable, "gupta.harshit99"));
        productStockObservable.add(new EmailAlertObserver(productStockObservable, "gupta.khushi"));
        productStockObservable.add(new SMSAlertObserver(productStockObservable, 100));

        productStockObservable.update(10);
    }
}
