package agency;

import util.TimeProvider;

public class Car implements Vehicle {

    private final String brand;
    private final String model;
    private final int productionYear;
    private final int numberOfSeats;
    private final static int MINIMAL_YEAR_VALUE=1900;

    public Car(String brand, String model, int productionYear, int numberOfSeats) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.numberOfSeats = numberOfSeats;
        try{
            if (productionYear<MINIMAL_YEAR_VALUE || productionYear>TimeProvider.currentYearValue()) throw new IllegalArgumentException(String.valueOf(getProductionYear()));
            if (numberOfSeats<1) throw new IllegalArgumentException(String.valueOf(numberOfSeats));
        } catch (IllegalArgumentException e) {System.out.println(e.getMessage());}
    }
}
