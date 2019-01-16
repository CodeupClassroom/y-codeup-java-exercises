package vehicles;

public class Automobile {
    private String make;
    private String model;
    private int numberOfWheels;

    public Automobile(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void goFast() {
        System.out.println("VROOOOOOM");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
