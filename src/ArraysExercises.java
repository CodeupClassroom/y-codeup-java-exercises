import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Fer");
        people[1] = new Person("Ryan");
        people[2] = new Person("Luis");

        for (Person p: addPerson(people, new Person("Lilo"))){
            System.out.println(p.getName());
        }

    }

    static Person[] addPerson (Person[] people, Person singlePerson){
        Person[] newListOfPeople = Arrays.copyOf(people, people.length+1);
        newListOfPeople[people.length] = singlePerson;
        return newListOfPeople;
    }

}
