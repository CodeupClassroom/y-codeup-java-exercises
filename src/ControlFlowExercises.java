import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        // 5 6 7 8 9 10 11 12 13 14 15
        int b = 5;
        while(b <= 15) {
            System.out.print(b + " ");
            b++;
        }

        System.out.println("Count from 0 to 100 by 2");
        int a = 0;
        do {
            System.out.println(a);
            a += 2;
        } while(a <= 100);


        // count from 100 to -10 by 5
        int num = 100;

        do {
            System.out.println(num);
            num = num - 5;
        } while(num >= -10 );

        // 2, 4, 16, 256, etc..
        long squaredNum = 2;
        do {
            System.out.println(squaredNum);
            squaredNum = squaredNum * squaredNum;
        } while(squaredNum < 1000000);


        // FizzBuzz
        // state, condition, mutation
        String fizzBuzz = "";

        for(int j = 1; j <= 100; j++) {
            if(j % 3 == 0) {
                fizzBuzz += "Fizz";
            }
            if(j % 5 == 0) {
                fizzBuzz += "Buzz";
            }
            if(j % 3 != 0 && j % 5 != 0) {
                fizzBuzz += j;
            }
            System.out.println(fizzBuzz);
            fizzBuzz = "";
        }

        for(int k = 1; k <= 100; k++) {
            if(k % 3 == 0 && k % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if(k % 5 == 0) {
                System.out.println("Buzz");
            } else if(k % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(k);
            }
        }


        int userInt;


        String userChoice;
        do {

            System.out.println("Please input a number to get the square and cube: ");
            userInt = scan.nextInt();

            System.out.println("Here is your table!");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for(int i = 1; i <= userInt; i++) {
                System.out.printf("%-6d | %-7d | %-5d%n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));

            }
            System.out.println("Do you want to do another number?");
            userChoice = scan.next();

        } while(userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes"));


        System.out.println("What's the grade?");
        int grade = scan.nextInt();
        String letterGrade;

        if(grade >= 88) {
            letterGrade = "A";
        } else if(grade >= 80) {
            letterGrade = "B";
        } else if(grade >= 67) {
            letterGrade = "C";
        } else if(grade >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        System.out.println("Grade is a " + letterGrade);

    }
}
