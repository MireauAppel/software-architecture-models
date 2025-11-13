package agency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;


public class RentalAgency {
    private final List<Vehicle> vehicles;
    private final Map<Client, Vehicle> rentedVehicles;

    public RentalAgency() {
        this.vehicles = new ArrayList<>();
        this.rentedVehicles = new HashMap<>();
    }
    public RentalAgency(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
        this.rentedVehicles = new HashMap<>();
    }

    public boolean vehicleIsRented(Vehicle v) {
        return rentedVehicles.containsValue(v);
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

    public List<Vehicle> select(Predicate<Vehicle> criterion) {
        return vehicles.stream().filter(vehicle -> criterion.test(vehicle)).toList();
    }
    public void printSelectedVehicles(Predicate<Vehicle> criterion) {
        select(criterion).forEach(System.out::println);
    }
}
