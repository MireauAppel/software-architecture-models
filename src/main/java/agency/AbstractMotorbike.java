package agency;

public class AbstractMotorbike extends AbstractVehicle {

    private final int cylinderCapacity;
    private final static int MINIMAL_CAPACITY=50;
    private final static double PRICE_PER_UNIT_OF_CYLINDER_CAPACITY=0.25;
    private final static String TYPE="Motorbike";

    public AbstractMotorbike(String brand, String model, int productionYear, int cylinderCapacity) {
        super(brand, model, productionYear);
        this.cylinderCapacity = cylinderCapacity;
        if (cylinderCapacity<MINIMAL_CAPACITY) throw new IllegalArgumentException(String.valueOf(cylinderCapacity));
    }

    public double dailyRentalPrice() {
        return PRICE_PER_UNIT_OF_CYLINDER_CAPACITY*cylinderCapacity;
    }

    public String toString(){
        return TYPE + ' ' + brand + ' ' + model + ' ' + productionYear + " (" + cylinderCapacity + " cm³) " + ": " + dailyRentalPrice() + '€';
    }
}
