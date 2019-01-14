import java.util.Scanner;

public class UserWantsToContinue {
    public static void main(String[] args) {
        int counter = 0;
        do {
            counter++;
            System.out.println("The loop has run " + counter + " times");

        } while(userWantsToContinue());


        System.out.println("The loop finished running. ");
        System.out.println("It ran a total of " + counter + " times.");

    }

    public static boolean userWantsToContinue() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Do you want to continue? Type y or yes.");
        String userInput = scanner.next();
        boolean willContinue = userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
        return willContinue;

    }
}
