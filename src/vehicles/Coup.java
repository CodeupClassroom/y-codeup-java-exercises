package vehicles;

public class Coup extends Automobile {
    private int numberOfDoors;

    public Coup(String make, String model) {
        super(make, model);
        setNumberOfWheels(4);
        numberOfDoors = 2;
    }
}
