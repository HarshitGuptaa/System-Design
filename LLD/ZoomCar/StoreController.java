package LLD.ZoomCar;

import java.util.*;

public class StoreController{
    Map<String,List<Store>> locationVsStores = new HashMap<>();

    public void addStore(String location, Store store){
        if(locationVsStores.containsKey(location)){
            List<Store> stores = locationVsStores.get(location);
            if(!stores.contains(store)) stores.add(store);
        }else{
            locationVsStores.put(location, List.of(store));
        }
    }

    public List<Store> getListofStores(String location){
        return locationVsStores.get(location);
    }

}