package agency;

import util.TimeProvider;

public abstract class AbstractVehicle implements Vehicle {

    public final String brand;
    public final String model;
    public final int productionYear;
    public final static int MINIMAL_YEAR_VALUE=1900;

    public AbstractVehicle(String brand, String model, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        if (productionYear<MINIMAL_YEAR_VALUE || productionYear>TimeProvider.currentYearValue()) throw new IllegalArgumentException(String.valueOf(getProductionYear()));
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


    public abstract String vehicleDetails();

    public abstract String type();
    @Override
    public abstract double dailyRentalPrice();


    public String toString(){
        return type() + ' ' + brand + ' ' + model + ' ' + productionYear + " (" + vehicleDetails() + ") " + ": " + dailyRentalPrice() + '€';
    }
}

