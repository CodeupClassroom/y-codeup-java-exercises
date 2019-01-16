package vehicles;

public class Sedan extends Automobile {
    private int numberOfDoors;

    public Sedan(String make, String model) {
        super(make, model);
        setNumberOfWheels(4);
        numberOfDoors = 4;
    }


}
