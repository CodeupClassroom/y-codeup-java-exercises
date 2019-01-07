import java.util.Scanner;

public class IOLecture {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
//        int age = scanner.nextInt();
//        scanner.nextLine();

        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("What's your name?");
        String name = scanner.nextLine();

        String first = scanner.next();
        String second = scanner.next();

        System.out.println("second = " + second);
        System.out.println("first = " + first);

        System.out.format("Hello there, %s. Nice to see you. %d \n", name, age);
        System.out.println("Hello there, "+ name + ". Nice to see you. "+age+" \n");



    }

}
