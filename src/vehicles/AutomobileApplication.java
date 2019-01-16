package vehicles;

import util.Input;

public class AutomobileApplication {

    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("What kind of vehicle do you want?");
        System.out.println("1 - Convertible");
        System.out.println("2 - Coup");
        System.out.println("3 - Motorcycle");
        System.out.println("4 - Sedan");

        int userChoice = input.getInt(1, 4);

        Automobile vehicle;

        if(userChoice == 1) {
            vehicle = new Convertible("Toyota", "MR2 Spyder");
        } else if(userChoice == 2) {
            vehicle = new Coup("Chevy", "Camero");
        } else if(userChoice == 3) {
            vehicle = new Motorcycle("Yahama", "R6");
        } else {
            vehicle = new Sedan("Chrysler", "Sebring");
        }

        System.out.println("Congratulation on your new vehicle!");
        System.out.println("Your vehicle has " + vehicle.getNumberOfWheels() + " wheels.");

        // example of calling a method that's defined on all objects of that type.
        vehicle.goFast(); // example of polymorphism

        // we use instanceof to see if the variable is a specific type of object
        if(vehicle instanceof Motorcycle) {
            ((Motorcycle) vehicle).doWheely();
        }


    }
}
