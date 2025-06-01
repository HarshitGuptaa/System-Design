package LLD.ZoomCar;

import java.util.*;

public class VehicleController {
    Map<Integer,List<Vehicle>> storeIdToVehicleMap = new HashMap<>();
    
    public void addVehicleToStore(int storeId, Vehicle vehicle){
        if(storeIdToVehicleMap.containsKey(storeId)){
            List<Vehicle> vehicles = storeIdToVehicleMap.get(storeId);
            vehicles.add(vehicle);
        }else{
            storeIdToVehicleMap.put(storeId, new ArrayList<>(List.of(vehicle)));
        }
    }

    public List<Vehicle> getVehicles(int storeId){
        return storeIdToVehicleMap.getOrDefault(storeId, new ArrayList<>());
    }

    public List<Booking> getBookedDates(Vehicle vehicle){
        //we send booked dates to FE who will disable them. user will then choose a free date
        return vehicle.getBookedList();
    }

    public Boolean bookVehicle(Vehicle vehicle, List<Integer> bookingDates){
        List<Booking> bookingsList = vehicle.getBookedList();
        
        if(bookingsList.isEmpty()){
            bookingsList.add(new Booking(vehicle.vehicleNumber, bookingDates));
        }else{
            for(Booking booking:bookingsList){
                List<Integer> dates = booking.getDatesBooked();
                for(int date:bookingDates){
                    if(dates.contains(date)) {
                        System.out.println("Vehicle already booked for date: "+date);
                        return false;
                    }
                }
            }
            Booking booking = new Booking(vehicle.vehicleNumber,bookingDates);
            vehicle.getBookedList().add(booking);
        }
        return true;
    }
}
