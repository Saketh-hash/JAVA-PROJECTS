// package CRT DAY 8;
// Task 5 - Search function with TreeSet
// Objective: Simulate a search functionality.
// Instructions:
// Create a TreeSet of product names: Keyboard, Mouse, Monitor, CPU, Webcam.
// Ask the user to enter a product name.
// Check if the entered product exists in the set or not.
// Print a message accordingly.
import java.util.*;

public class SearchTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        treeSet.add("Keyboard");
        treeSet.add("Mouse");
        treeSet.add("Monitor");
        treeSet.add("CPU");
        treeSet.add("Webcam");
        System.out.println("Enter a product name: ");
        String product = sc.nextLine();
        if (treeSet.contains(product)) {
            System.out.println("Yes, The product " + product + " is in the TreeSet");
        }else{
            System.out.println("No, The product " + product + " is not in the TreeSet");
        }
        sc.close();
    }
}
