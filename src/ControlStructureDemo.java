import java.util.Scanner;

public class ControlStructureDemo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("What's your favorite number?");
        int number = scan.nextInt();

        if(number == 2) {
            System.out.println("That's my favorite number, too!");
        } else {
            System.out.println("The input was not two.");
        }

        System.out.println("We use == to compare primitives.");

        System.out.println("What's your favorite fruit?");
        String favoriteFruit = scan.next();

        // double equals w/ strings is discouraged
        // == w/ strings asks if the two values point to the same reference in memory
        if(favoriteFruit.equalsIgnoreCase("mango")) {
            System.out.println("We love mangos");
        } else {
            System.out.println("Why don't you love mangos?");
        }

        System.out.println("Do you want to do the loop?");
        String wantToLoop = scan.next();
        boolean wantsToContinue = wantToLoop.contains("yes");
        int count = 0;

        while(wantsToContinue) {
            System.out.println("We run the loop");
            count++;

            System.out.println("Do you want to continue the loop?");
            wantToLoop = scan.next();
            wantsToContinue = wantToLoop.equalsIgnoreCase("yes") || wantToLoop.equalsIgnoreCase("y");
        }

        System.out.println("The loop ran " + count + " times.");

        System.out.println("Let's sum up all the integers between 1 and 100 including 1 and 100");
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}
