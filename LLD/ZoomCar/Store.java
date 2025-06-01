package LLD.ZoomCar;

import java.util.List;

public class Store {
    private int id;
    private String name;
    private String city;
    private List<Vehicle> vehicles;

    public Store(int id, String name, String city, List<Vehicle> vehicles) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.vehicles = vehicles;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", vehicles=" + vehicles +
                '}';
    }
}
