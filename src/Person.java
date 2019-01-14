import java.util.Scanner;

public class Person {
    private String name;

    // data type the constructor returns is an object
    // the type of object is a Person type
    public Person(String name) {
        this.name = name;
    }

    // getter (gets a value)
    public String getName() {
        return name;
    }

    // setters => sets a value
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Pat");

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println("What is the second person's name?");
        String name = scan.next();

        Person person2 = new Person(name); // we get this value at runtime

        System.out.println(person1);
        System.out.println(person2);

        System.out.println("These are the same object: " + (person1 == person2));

        System.out.println("The name string is the same String object: " + (person1.getName() == person2.getName()));

        boolean sameSequenceOfCharacters = person1.getName().equals(person2.getName());

        System.out.println("It is " + sameSequenceOfCharacters + " that " + person1.getName() + " and " + person2.getName() + " are the same sequence of chars.");

        Person person3 = person1;
        System.out.println(person3);
        System.out.println(person1);
        person3.setName("Bob");
        System.out.println(person1.getName());
    }
}
