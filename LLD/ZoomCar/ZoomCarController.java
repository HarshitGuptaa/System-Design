package LLD.ZoomCar;

import java.util.ArrayList;
import java.util.List;

public class ZoomCarController {

    public void launch(){
        StoreController storeController = new StoreController();
        VehicleController vehicleController = new VehicleController();
        
        // Create vehicles
        Vehicle v1 = new Vehicle(1,"Swift",4,new ArrayList<>());
        Vehicle v2 = new Vehicle(7,"Baleno",4,new ArrayList<>());

        // Create store with vehicles
        Store store = new Store(1, "Gupta Store", "Delhi", new ArrayList<>(List.of(v1, v2)));
        
        // Add store to controller
        storeController.addStore("Delhi", store);

        // Add vehicles to vehicle controller
        vehicleController.addVehicleToStore(1, v1);
        vehicleController.addVehicleToStore(1, v2);

        // Get and print list of stores in Delhi
        List<Store> delhiStores = storeController.getListofStores("Delhi");
        System.out.println("Stores in Delhi: " + delhiStores);

        // User selects store and Vehicles are shown
        int storeId = delhiStores.get(0).getId();
        List<Vehicle> vehicles = vehicleController.getVehicles(storeId);
        System.out.println("Vehicles in storeId: " + storeId + "are: "+vehicles);

        //User selects a vehicle and booked Dates are shown
        //Based on it user will select an unbooked date
        List<Booking> bookings = vehicleController.getBookedDates(v1);
        System.out.println("Bookings: "+bookings);

        //Book the vehicle
        Boolean isBooked = vehicleController.bookVehicle(v1, new ArrayList<>(List.of(1,2)));
        if(isBooked) System.out.println("Vehicle Booked");
        else System.out.println("Vehicle Not Booked. Select diff. dates");
    
        //Retry Booking same vehicle
        Boolean isBooked2 = vehicleController.bookVehicle(v1, new ArrayList<>(List.of(2)));
        if(isBooked2) System.out.println("Vehicle Booked");
        else System.out.println("Vehicle Not Booked. Select diff. dates");

         //Retry Booking same vehicle for next date
        Boolean isBooked3 = vehicleController.bookVehicle(v1, new ArrayList<>(List.of(3)));
        if(isBooked3) System.out.println("Vehicle Booked");
        else System.out.println("Vehicle Not Booked. Select diff. dates");

        //Get booked dates
        List<Booking> bookings2 = vehicleController.getBookedDates(v1);
        System.out.println("Bookings: "+bookings2);  
    }

    public static void main(String[] args) {
        ZoomCarController zoomCarController = new ZoomCarController();
        zoomCarController.launch();
    }
}
