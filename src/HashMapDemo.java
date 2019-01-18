import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo {
        public static void main(String[] args) {

            // HashMap<KeyType, ValueType> variableName = new HashMap<>();
            HashMap<String, String> contactInfo = new HashMap<>();

            contactInfo.put("name", "Sally");
            contactInfo.put("email", "sally@microsoft.com");
            contactInfo.put("office", "Seattle");

            if(contactInfo.containsKey("email")) {
                contactInfo.get("email");
            }

            contactInfo.getOrDefault("email", "info@microsoft.com");

            if(contactInfo.containsValue("Seattle")) {
                System.out.println("Do you want to relocate to sunny San Antonio?");
            }

            HashMap<String, Person> team = new HashMap<>();
            team.put("CEO", new Person("Jane"));
            team.put("CFO", new Person("Pat"));

            Input input = new Input();

            String role = input.getString("What is your role?");
            String name = input.getString("What is your name?");
            Person newPerson = new Person(name);

            team.put(role, newPerson);

            System.out.println(team.get("CEO").getName());

            if(team.containsKey("Janitor")) {
                String message = "Get " + team.get("Janitor").getName() + " to help.";
                System.out.println(message);
            }

            System.out.println("You're in charge of your environment!");


            HashMap<String, ArrayList<Person>> employees = new HashMap<>();

            ArrayList<Person> accounting = new ArrayList<>();
            accounting.add(new Person("Bob"));
            accounting.add(new Person("Jane"));

            employees.put("Accounting", accounting);


            ArrayList<Person> developers = new ArrayList<>();
            developers.add(new Person("Dorian"));
            developers.add(new Person("Nathaniel"));
            developers.add(new Person("Shawn"));

            employees.put("Developers", developers);

            System.out.println("Let's see what departments we have:");

            // hashMapVariable.keySet() gives you back the list of keys.
            for(String department : employees.keySet()) {
                System.out.println(department);
            }

        }
}
