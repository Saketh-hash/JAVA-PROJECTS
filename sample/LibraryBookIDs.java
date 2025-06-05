// package CRT DAY 8;
// Task 3 - Library Book IDs
// Objective: Use TreeSet methods like first(), last(), higher(), and lower().
// Instructions:
// Store the following Book IDs: 5002, 4998, 5005, 4999, 5001.
// Find and print:
// The first Book ID.
// The last Book ID.
// The Book ID immediately higher than 4999.
// The Book ID immediately lower than 5005.
import java.util.*;
public class LibraryBookIDs {
    public static void main(String[] args) {
        TreeSet<Integer> bookIDs = new TreeSet<>();
        bookIDs.add(5002);
        bookIDs.add(4998);
        bookIDs.add(5005);
        bookIDs.add(4999);
        bookIDs.add(5001);
        System.out.println("The BookIDs are: " + bookIDs);
        System.out.println("The first BookID is: " + bookIDs.first());
        System.out.println("The last BookID is: " + bookIDs.last());
        System.out.println("The BookID immediately higher than 4999 is: " + bookIDs.higher(4999));
        System.out.println("The BookID immediately lower than 5005 is: " + bookIDs.lower(5005));
    }
}
