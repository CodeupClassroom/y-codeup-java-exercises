public class Employee extends Person {
    String jobRole;

    public Employee(String name, String jobRole) {
        super(name); // utilize the parent's constructor
        this.jobRole = jobRole;
    }

    public void doWork() {
        System.out.println("Work work work!");
    }
}
