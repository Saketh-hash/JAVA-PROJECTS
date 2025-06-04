// Task - Student class with encapsulation
// Hint : Private Fileds: name, rollNumber, marks
// Use Getters and Setters Method to check pass or fail (pass if marks >= 40)
import java.util.*;
class Student {
    private String name;
    private int rollNumber;
    private int marks;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }

    public int getRollNumber(){
        return rollNumber;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }
    public int getMarks(){
        return marks;
    }

    public void passOrFail(){
        if(marks >= 40){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

public class OOPSTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.setName(sc.nextLine());
        s1.setRollNumber(sc.nextInt());
        s1.setMarks(sc.nextInt());
        s1.display();
        s1.passOrFail();
        sc.close();
    }
}
