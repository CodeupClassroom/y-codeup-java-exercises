// methods are functions that live on a class or an object
public class MethodDemo {
    // visibility (public, protected, private)
    // static vs. instance (static keyword or no static keyword)
    // for now, static means "just a function"
    // return type of the method (int, boolean, String, void)
    // name of the method
    // parameters in parenthesis
    // b/c java is strictly typed, we need to provide types
    public static void main(String[] args) {
        System.out.println(sayHi());
        System.out.println(sayHi("Pat"));
        System.out.println(sayHi("Jane", "Janeway"));
        System.out.println(sayHi("Jane", "Janeway"));


        int number = 3;
        if(isTwo(number)) {
            System.out.println("The number is two");
        } else {
            System.out.println(number + " is not 2");
        }

        System.out.println(addFive(10));
        System.out.println(addFive(3.141));
        System.out.println(addFive(32456756783456789L));

        System.out.println(getPower(5, 5));
    }

    // Scenario: We need to write a method that adds 5 to any number.
    // Constraints: We need this to work for int, double, long.
    // Constraints: If we send in a number that is an int, return an int.
    // Constraints: If we send in a number that is an double, return an double.
    // Constraints: If we send in a number that is an long, return an long.
    // "Method Overloading"
    public static int addFive(int number) {
        return number + 5;
    }

    public static double addFive(double number) {
        return number + 5;
    }

    public static long addFive(long number) {
        return number + 5;
    }

    // write a method called sayHi
    // sayHi should accept one single string as its argument
    // that returns a string "Hi there, " with a name
    public static String sayHi() {
        return "Hi there, buddy!";
    }

    public static String sayHi(String name) {
        return "Hi there, " + name;
    }

    public static String sayHi(String first, String last) {
        return "Hi there, " + first + " " + last;
    }

    public static boolean isTwo(int number) {
        return number == 2;
    }

    public static String concat(String a, String b) {
        return a + b;
    }

    public static void songThatNeverEnds() {
        String lyrics = "This is the song that never ends. It goes on and on, my friends. Some people people started signing it not knowing what it was and now they keep on singing it forever just because....";
        System.out.println(lyrics);
        songThatNeverEnds();
    }

    public static long getPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * getPower(base, exponent - 1);
    }

    public static int getOne(int number) {
        if(number > 1) {
            return getOne(number -1);
        } else if(number < 1) {
            return getOne(number + 1);
        } else {
            return number; // because the number is 1.
        }
    }



}
