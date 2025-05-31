package ObserverPattern.Observer;
import ObserverPattern.Observable.ProductStockObservable;

public class SMSAlertObserver implements NotificationAlertObserver{

    ProductStockObservable observable;
    int number;

    public SMSAlertObserver(ProductStockObservable observable, int number){
        this.observable=observable;
        this.number=number;
    }

    @Override
    public void sendNotification() {
        System.out.println("Stocks left: "+observable.getStock());
        System.out.println("SMS sent to: "+number);
    }
    
}
