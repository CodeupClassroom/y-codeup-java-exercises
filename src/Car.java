public class Car {
    public static void main(String[] args) {
        System.out.println(Car.getNumberOfCars());

        Car batmobile = new Car("Wayne Enterprises", "Batmobile");
        Car beetle = new Car("VW", "BUG");

        System.out.println(Car.getNumberOfCars());

        System.out.println("Current speed is: :" + beetle.speed);
        beetle.accelerate();
        beetle.accelerate();
        beetle.accelerate();
        System.out.println("Gas tank: "  + beetle.gasTank);
        System.out.println("Speed is: " + beetle.speed);
        System.out.println("Distance is: " + beetle.miles);
        beetle.slamOnBrakes();

        System.out.println("Speed is: " + beetle.speed);

        batmobile.accelerate();
        batmobile.accelerate();
        batmobile.brake();
        batmobile.accelerate();
        batmobile.accelerate();
        batmobile.accelerate();
        batmobile.accelerate();
        batmobile.slamOnBrakes();


    }

    public String make;
    public String model;
    public short year;
    public String color;

    public int speed;
    public int gasTank;
    public int miles;

    private static int numberOfCars = 0;

    // constructor
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        numberOfCars++;
        gasTank = 100;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public void accelerate() {
        if(model.equals("Batmobile")) {
            speed += 100;
            gasTank--;
            miles += 5;

        } else {
            gasTank--;
            speed++;
            miles++;
        }

        System.out.println("This car is now going: " + speed);
    }

    public void brake() {
        speed--;
    }

    public void slamOnBrakes() {
        speed = 0;
        System.out.println("SCREEEETCH");
    }

    public void honk() {
        System.out.println("HONK HONK!");
    }

}
