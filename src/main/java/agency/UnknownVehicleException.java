package agency;

public class UnknownVehicleException extends RuntimeException {
    private final Vehicle vehicle;

    public UnknownVehicleException(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public String getMessage() {
        return vehicle.toString() + "not in agency";
    }
}
