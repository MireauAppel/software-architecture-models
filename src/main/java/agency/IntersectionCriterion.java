package agency;

import java.util.function.Predicate;

public class IntersectionCriterion implements Predicate<Vehicle> {
    private final double maxPrice;
    private final String brand;

    public IntersectionCriterion(double maxPrice, String brand) {
        this.maxPrice = maxPrice;
        this.brand = brand;
    }

    @Override
    public boolean test(Vehicle vehicle) {
        return vehicle.getBrand().equals(brand) && vehicle.dailyRentalPrice() <= maxPrice;
    }
}
