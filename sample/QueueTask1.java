// Task 1 - Imagine that you are at the Ice Cream truck. 
// Kids are standing in a queue to buy ice cream.
// Waiting for their turn to get the ice cream. The others must wait for their turn - no skipping.
// HINT: Make a queue....


import java.util.*;
public class QueueTask1 {
    public static void main(String[] args) {
        Queue<String> kids = new LinkedList<>();
        kids.add("Alice");
        kids.add("Bob");
        kids.add("Charlie");
        kids.add("David");
        System.out.println("The kids are: " + kids);
        System.out.println("The number of kids are: " + kids.size());
        String firstKid = kids.poll();
        System.out.println("The first kid is: " + firstKid);
        System.out.println("The number of kids are: " + kids.size());
        String secondKid = kids.poll();
        System.out.println("The second kid is: " + secondKid);
        System.out.println("The number of kids are: " + kids.size());
        String thirdKid = kids.poll();
        System.out.println("The third kid is: " + thirdKid);
        System.out.println("The Queue is: " + kids);
        System.out.println("The number of kids are: " + kids.size());
        
    }
}
