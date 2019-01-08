import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println("What's your favorite number?");
        int number = scan.nextInt();

        System.out.println("Number is: " + number);

        System.out.println("What's your favorite programming language?");
        String language = scan.next();

        System.out.println(language + " is awesome!");
    }
}
