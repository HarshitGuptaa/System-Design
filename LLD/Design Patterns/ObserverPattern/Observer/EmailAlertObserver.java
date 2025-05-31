package ObserverPattern.Observer;

import ObserverPattern.Observable.ProductStockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{
    
    ProductStockObservable observable;
    String email;

    public EmailAlertObserver(ProductStockObservable observable, String email){
        this.observable=observable;
        this.email=email;
    }

    @Override
    public void sendNotification() {
        System.out.println("Stocks left: "+observable.getStock());
        System.out.println("Email sent at: "+email);
    }
    
}
