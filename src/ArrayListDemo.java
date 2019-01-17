import util.Input;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        Input input = new Input();

        // create a new ArrayList
        ArrayList<Person> people = new ArrayList<>();

        Person newPerson;

        do {

            String name = input.getString("What is the person's name?");

            newPerson = new Person(name);

            people.add(newPerson); // .add is how you add to an arrayList

        } while (input.yesNo("Would you like to add another person to the list?"));

        for(Person person : people) {
            System.out.println(person.getName());
        }

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("VW", "Bug"));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.remove(99);
        numbers.contains(99);

    }
}
