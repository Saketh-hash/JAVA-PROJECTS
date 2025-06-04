import java.util.*;
public class QueueExample {
    // queue.poll() and queue.remove() are similar, 
    // But queue.remove() throws an exception if the queue is empty, while queue.poll() returns null.
    public static void main(String[] args) {
        Queue<String> students = new LinkedList<>();

        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");

        System.out.println("The students are: " + students);
        System.out.println("The number of students are: " + students.size());
        String firstStudent = students.poll();
        System.out.println("The first student is: " + firstStudent);
        System.out.println("The number of students are: " + students.size());
        String secondStudent = students.poll();
        System.out.println("The second student is: " + secondStudent);
        System.out.println("The number of students are: " + students.size());
        // String thirdStudent = students.poll();
        System.out.println("The students are: " + students);
        
    }
}