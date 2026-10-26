package agency;

import java.util.function.Predicate;

public class MaxPriceCriterion implements Predicate<Vehicle> {
    private final double maxPrice;

    public MaxPriceCriterion(double maxPrice) {
        this.maxPrice = maxPrice;
    }
    @Override
    public boolean test(Vehicle vehicle) {
        return vehicle.dailyRentalPrice() <= maxPrice;
    }
}
