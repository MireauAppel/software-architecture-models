package agency;

import util.TimeProvider;

public class Car implements Vehicle {

    private final String brand;
    private final String model;
    private final int productionYear;
    private final int numberOfSeats;
    private final static int MINIMAL_YEAR_VALUE=1900;
    private final static int PRICE_PER_SEAT_FOR_OLD_CAR=20;
    private final static int PRICE_PER_SEAT_FOR_NEW_CAR=40;
    private final static String TYPE="Car";

    public Car(String brand, String model, int productionYear, int numberOfSeats) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.numberOfSeats = numberOfSeats;
        if (productionYear<MINIMAL_YEAR_VALUE || productionYear>TimeProvider.currentYearValue()) throw new IllegalArgumentException(String.valueOf(getProductionYear()));
        if (numberOfSeats<1) throw new IllegalArgumentException(String.valueOf(numberOfSeats));
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
        if (isNew()){
            return PRICE_PER_SEAT_FOR_NEW_CAR*numberOfSeats;
        }
        return PRICE_PER_SEAT_FOR_OLD_CAR*numberOfSeats;
    }

    public String toString(){
        if (numberOfSeats==1) {
            return TYPE + ' ' + brand + ' ' + model + ' ' + productionYear + " (" + numberOfSeats + " seat) " + ": " + dailyRentalPrice() + '€';
        }
        return TYPE + ' ' + brand + ' ' + model + ' ' + productionYear + " (" + numberOfSeats + " seats) " + ": " + dailyRentalPrice() + '€';
    }
}
