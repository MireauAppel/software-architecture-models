package agency;

import util.TimeProvider;
//EN QUOI CE CODE ET CELUI DE VEHICLESPECIFICS DIFFERE DE CAR ET VEHICLE? ON REFAIT EXACTEMENT LA MEME CHOSE
public class CarSpecifics implements VehicleSpecifics{

    private final int productionYear;
    private final int numberOfSeats;
    private final static int MINIMAL_YEAR_VALUE=1900;
    private final static int PRICE_PER_SEAT_FOR_OLD_CAR=20;
    private final static int PRICE_PER_SEAT_FOR_NEW_CAR=40;
    private final static String TYPE="Car";

    public CarSpecifics( int numberOfSeats, int productionYear ) {
        this.numberOfSeats = numberOfSeats;
        this.productionYear = productionYear;
        if (productionYear<MINIMAL_YEAR_VALUE || productionYear>TimeProvider.currentYearValue()) throw new IllegalArgumentException(String.valueOf(productionYear));
        if (numberOfSeats<1) throw new IllegalArgumentException(String.valueOf(numberOfSeats));
    }


    @Override
    public boolean isNew() {
        return TimeProvider.currentYearValue() - 5 <= productionYear;
    }

    @Override
    public String type() {
        return TYPE;
    }

    @Override
    public double dailyRentalPrice() {
        if (isNew()){
            return PRICE_PER_SEAT_FOR_NEW_CAR*numberOfSeats;
        }
        return PRICE_PER_SEAT_FOR_OLD_CAR*numberOfSeats;
    }

    @Override
    public String vehicleDetails() {
        if (numberOfSeats==1){return numberOfSeats+" seat";}
        return numberOfSeats+" seats";
    }
}
