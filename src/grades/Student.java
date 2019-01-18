package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;
    private double average;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public double getGradeAverage() {
        double total = 0;
        for(int grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public void showAllGrades() {
        for(int grade : grades) {
            System.out.print(grade + "\t");
        }
    }

    public String toString() {
        return name + " earned an average grade of " + getGradeAverage() + ".";
    }

    public static void main(String[] args) {
        Student student = new Student("Bob");
        student.addGrade(100);
        student.addGrade(90);
        student.addGrade(95);
        System.out.println(student);
    }
}