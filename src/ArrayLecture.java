import java.util.Arrays;

public class ArrayLecture {
    public static void main(String[] args) {

        // using the array initializer syntax
        int[] numbers = new int[100];

        Arrays.fill(numbers, 7);

        // let's make a new array that's double the length
        int[] otherNumbers = new int[numbers.length * 2];
        Arrays.fill(otherNumbers, 9);

        int sum = 0;
        for(int num : numbers) {
            sum += num;
        }

        System.out.println("Array sum is: " + sum);

        sum = 0;
        for(int num : otherNumbers) {
            sum += 9;
        }

        System.out.println("Sum of otherNumbers is: " + sum);

        Person[] cohort = new Person[5];

        cohort[0] = new Person("Ringo");
        cohort[1] = new Person("Paul");
        cohort[2] = new Person("George");
        cohort[3] = new Person("John");
        cohort[4] = new Person("Maharishi Mahesh Yogi");

        for(Person person : cohort) {
            System.out.println(person.getName());
        }

        Car[] cars = new Car[2];
        cars[0] = new Car("VW", "Bug");
        cars[1] = new Car("Tesla", "S");
    }
}
