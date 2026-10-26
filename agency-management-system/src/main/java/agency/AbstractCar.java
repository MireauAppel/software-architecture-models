package agency;

public class AbstractCar extends AbstractVehicle {

    private final int numberOfSeats;
    private final static int PRICE_PER_SEAT_FOR_OLD_CAR=20;
    private final static int PRICE_PER_SEAT_FOR_NEW_CAR=40;
    private final static String TYPE="Car";

    public AbstractCar(String brand, String model, int productionYear, int numberOfSeats) {
        super(brand, model, productionYear);
        this.numberOfSeats = numberOfSeats;
        if (numberOfSeats<1) throw new IllegalArgumentException(String.valueOf(numberOfSeats));
    }

    public double dailyRentalPrice() {
        if (isNew()){
            return PRICE_PER_SEAT_FOR_NEW_CAR*numberOfSeats;
        }
        return PRICE_PER_SEAT_FOR_OLD_CAR*numberOfSeats;
    }

    public String type(){
        return TYPE;
    }
    public String vehicleDetails(){
        if (numberOfSeats==1){return numberOfSeats+" seat";}
        return numberOfSeats+" seats";
    }

}
