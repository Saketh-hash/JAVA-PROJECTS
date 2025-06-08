// package CRT DAY 9;
// Student Management (OOP + ArrayList)
// Task 8: Create Student class with name, age, and grade attributes.
// Add 5 students to an arraylist.
// Print the name of students with grade above 80.

import java.util.ArrayList;
class Student{
    // Create Student class with name, age, and grade attributes.
    String name;
    int age;
    int grade;
    Student(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void displayStudents(){
       System.out.println("Name: " + name + " " + "Age: " + age + " " + "Grade: "+ grade);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        // Add 5 students to an arraylist.
        students.add(new Student("John", 18, 85));
        students.add(new Student("Jane", 19, 90));
        students.add(new Student("Jack", 20, 75));
        students.add(new Student("Jill", 21, 80));
        students.add(new Student("Joe", 22, 95));

        System.out.println("The Students are: ");
        for (Student student : students){
            student.displayStudents();
        }
        System.out.println("The Total Number of Students are: " + students.size());
        System.out.println("The name of students with grade above 80 are:");
        // Print the name of students with grade above 80.
        for (Student student : students) {
            if (student.grade > 80) {
                System.out.println(student.name);
            }
        }
    }
}
