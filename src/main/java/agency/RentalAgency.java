package agency;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> vehicles;

    public RentalAgency() {
        vehicles = new ArrayList<>();
    }
    public RentalAgency(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public boolean contains(Vehicle vehicle) {
        return vehicles.contains(vehicle);
    }
    public boolean add(Vehicle vehicle) {
        if (contains(vehicle)) {
            return false;
        }
        vehicles.add(vehicle);
        return true;
    }
    public void remove(Vehicle vehicle) {
        if (contains(vehicle)) {
            vehicles.remove(vehicle);
        }else  {
            throw new UnknownVehicleException(vehicle);
        }
    }
    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
