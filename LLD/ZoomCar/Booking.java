package LLD.ZoomCar;

import java.util.List;

public class Booking {
    
    int vehicleId;
    List<Integer> datesBooked;

    public Booking(int vehicleNumber, List<Integer> bookingDates) {
    this.vehicleId=vehicleNumber;
    this.datesBooked=bookingDates;
    }

    public Booking(int vehicleNumber) {
        //TODO Auto-generated constructor stub
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public List<Integer> getDatesBooked() {
        return datesBooked;
    }

    public void setDatesBooked(List<Integer> datesBooked) {
        this.datesBooked = datesBooked;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "vehicleId=" + vehicleId +
                ", datesBooked='" + datesBooked + '\'' +
                '}';
    }
}
