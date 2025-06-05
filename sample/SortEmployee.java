// package CRT DAY 8;
// Task 4 - Sort employee names in reverse
// Objective: Use a TreeSet with a custom comparator to sort strings in descending order.
// Instructions:
// Create a TreeSet named employeeNames that stores employee names in reverse alphabetical order.
// Add the following employee names to the TreeSet: "Sumit", "Karan", "Anjali", "Mohan", "Zoya".
// Display the names in reverse order.
import java.util.*;
public class SortEmployee {
    public static void main(String[] args) {
        // Custom Comparator for descending order of the Employee TreeSet
        TreeSet<String> employeeNames = new TreeSet<>(Comparator.reverseOrder());
        employeeNames.add("Sumit");
        employeeNames.add("Karan");
        employeeNames.add("Anjali");
        employeeNames.add("Mohan");
        employeeNames.add("Zoya");    
        System.out.println("The employee names in reverse order are: " + employeeNames);
        
    }
}
