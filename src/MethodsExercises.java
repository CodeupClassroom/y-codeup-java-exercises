import java.util.Scanner;

/**
 * Create basic arithmetic methods:
 *   add, subtract, multiply, divide, remainder
 * Create a method called getInteger(min, max) that returns an integer in the range
 * Calculate and display the components for a factorial function
 */


public class MethodsExercises {
    public static void main(String[] args) {
        int x = getInt(1, 100);
        System.out.println(x);
    }

    public static int getInt() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        return scan.nextInt();
    }

    public static int getInt(int min, int max) {
        System.out.println("Please input an integer between " + min + " and " + max);
        int userInt = getInt();

        if(userInt < min || userInt > max) {
            System.out.println("The provided int was out of range.");
            userInt = getInt(min, max);
        }

        return userInt;
    }


    // create a multiply method without * operator and implement using recursion
    // recursive multiply version 1.0
    // this only works with a positive b
    public static int multiply(int a, int b) {

        if(a == 0 || b == 0) {
            return 0;
        }

        if(b > 0) {
            b--;
            return a + multiply(a, b);
        } else {
            return -multiply(a, -b);
        }

    }

    // multiply without * operator
    public static long multiply(long a, long b) {
        if(a == 0 || b == 0) {
            return 0;
        }

        long product = 0;

        if(b > 1) {
            do {
                product += a;
                b--;

            } while(b >= 1);
        } else {
            do {
                product -= a;
                b++;

            } while(b <= -1);
        }

        return product;
    }



    // create an add method that works with integers, doubles, and longs
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static long add(long a, long b) {
        return a + b;
    }

    // create a subtract method
    public static int subtract(int a, int b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    // create a divide method
    public static double divide(int numerator, int denominator) {
        return numerator / denominator;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    // create a remainder() method that returns the remainder of integer division of two numbers
    public static int remainder(int a, int b) {
        return a % b;
    }
}
