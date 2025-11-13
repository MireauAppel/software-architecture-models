package agency;

import java.util.function.Predicate;

public class BrandCriterion implements Predicate<Vehicle> {
    private final String brand;

    public BrandCriterion(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean test(Vehicle vehicle) {
        return vehicle.getBrand().equals(brand);
    }
}
