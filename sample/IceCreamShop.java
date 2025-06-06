// package Java Programs.CRT DAY 9;
import java.util.*;
public class IceCreamShop {
    public static void main(String[] args) {
        Queue<String> kids = new LinkedList<>();
        kids.add("Alice");
        kids.add("Bob");
        kids.add("Charlie");
        kids.add("David");
        kids.add("Eve");
        System.out.println("Kids in the queue: " + kids);
        // Show the first kid
        System.out.println("The First Kid in the queue: " + kids.peek());
        // Remove the first kid
        kids.poll();
        System.out.println("Queue after the removal of the first kid: " + kids);

        // Add a new kid at the end
        kids.add("Frank");
        System.out.println("Queue after adding a new kid: " + kids);
    } 
}
