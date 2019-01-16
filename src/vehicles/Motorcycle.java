package vehicles;

public class Motorcycle extends Automobile {

    public Motorcycle(String make, String model) {
        super(make, model); // this calls the parent constructor
        setNumberOfWheels(2);
    }

    public void doWheely() {
        System.out.println("WHHEEEEEEEEEE leee");
    }

}
