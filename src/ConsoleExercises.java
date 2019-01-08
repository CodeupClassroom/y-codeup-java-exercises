import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        // a new instance of the scanner object
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        double pi = 3.14159;
        System.out.format("%.2f%n", pi);

        System.out.print("Please enter 3 words: ");
        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();

        System.out.println("Please enter a sentence: ");
        String sentence = scan.next();
        System.out.println(sentence);

        System.out.println("What's your favorite number?");
        int favoriteNumber = scan.nextInt();
        System.out.println("You said your favorite number is: "  + favoriteNumber);

        System.out.println("What's your favorite fruit?");
        String fruit = scan.next();
        System.out.println("You said your favorite fruit is: " + fruit);

        System.out.println("Let's calculate the perimeter and area of a room!");
        System.out.println("What's the length?");

        String lengthString = scan.next();
        double length = Double.parseDouble(lengthString);

        System.out.println("What's the width?");
        double width = scan.nextDouble();

        System.out.println("What is the height of the room?");
        double height = scan.nextDouble();

        double area = length * width;
        double perimeter = 2*length + 2*width;
        double volume = length * width * height;

        System.out.print("The area is: ");
        System.out.format("%.2f%n", area);

        System.out.format("Perimeter is: " + perimeter);
        System.out.println();
        System.out.format("Volume is: " + volume);

    }
}
