package agency;

import util.TimeProvider;

public class MotorbikeSpecifics implements VehicleSpecifics {

    private final int productionYear;
    private final int cylinderCapacity;
    private final static int MINIMAL_YEAR_VALUE=1900;
    private final static int MINIMAL_CAPACITY=50;
    private final static double PRICE_PER_UNIT_OF_CYLINDER_CAPACITY=0.25;
    private final static String TYPE="Motorbike";

    public MotorbikeSpecifics(int productionYear, int cylinderCapacity) {
        this.productionYear = productionYear;
        this.cylinderCapacity = cylinderCapacity;
        if (productionYear<MINIMAL_YEAR_VALUE || productionYear> TimeProvider.currentYearValue()) throw new IllegalArgumentException(String.valueOf(productionYear));
        if (cylinderCapacity<MINIMAL_CAPACITY) throw new IllegalArgumentException(String.valueOf(cylinderCapacity));
    }

    public double dailyRentalPrice() {
        return PRICE_PER_UNIT_OF_CYLINDER_CAPACITY*cylinderCapacity;

    }

    @Override
    public boolean isNew() {
        return false;
    }

    public String type() {
        return TYPE;
    }

    @Override
    public String vehicleDetails() {
        return cylinderCapacity + "cm³";
    }
}
