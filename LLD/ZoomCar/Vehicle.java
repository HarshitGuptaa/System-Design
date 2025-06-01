package LLD.ZoomCar;

import java.util.List;

public class Vehicle {
    int vehicleNumber;
    String model;
    int vehicleType;
    List<Booking> bookedList;


    
    public Vehicle(int vehicleNumber, String model, int vehicleType, List<Booking> bookedList) {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.vehicleType = vehicleType;
        this.bookedList = bookedList;
    }

    public List<Booking> getBookedList() {
        return bookedList;
    }
    public void setBookedList(List<Booking> bookedList) {
        this.bookedList = bookedList;
    }
    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleNumber=" + vehicleNumber +
                ", model='" + model + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", bookedList=" + bookedList +
                '}';
    }
}
