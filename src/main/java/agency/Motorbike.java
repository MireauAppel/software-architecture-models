package agency;

import util.TimeProvider;

public class Motorbike implements Vehicle {

    private final String brand;
    private final String model;
    private final int productionYear;
    private final int cylinderCapacity;
    private final static int MINIMAL_YEAR_VALUE=1900;
    private final static int MINIMAL_CAPACITY=50;
    private final static double PRICE_PER_UNIT_OF_CYLINDER_CAPACITY=0.25;
    private final static String TYPE="Motorbike";

    public Motorbike(String brand, String model, int productionYear, int cylinderCapacity) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.cylinderCapacity = cylinderCapacity;
        if (productionYear<MINIMAL_YEAR_VALUE || productionYear>TimeProvider.currentYearValue()) throw new IllegalArgumentException(String.valueOf(getProductionYear()));
        if (cylinderCapacity<MINIMAL_CAPACITY) throw new IllegalArgumentException(String.valueOf(cylinderCapacity));
    }

    public boolean isNew(){
        return TimeProvider.currentYearValue() - 5 <= productionYear;
    }
    @Override
    public String getBrand() {
        return this.brand;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getProductionYear() {
        return this.productionYear;
    }

    @Override
    public double dailyRentalPrice() {
        return PRICE_PER_UNIT_OF_CYLINDER_CAPACITY*cylinderCapacity;
    }

    public String toString(){
        return TYPE + ' ' + brand + ' ' + model + ' ' + productionYear + " (" + cylinderCapacity + " cm³) " + ": " + dailyRentalPrice() + '€';
    }
}

