// Task Details: 
// Stack Task - Toy Box (LIFO):
// Add 3 toys to the toy box ("Ball, Blocks, Puzzle")
// Take out the top toy and show which toy is being played.
// Show the remaining toys in the toy box.

// Queue Task - Line of IceCream (FIFO):
// Add 3 kids to a queue ("Maya", "Leo", "Nina")
// Serve the first kid and print their name.
// Show who is still in line after one kid is served.
import java.util.*;
public class StackandQueueEx {
    public static void main(String[] args) {
        Stack<String> toys = new Stack<String>();
        System.out.println("--- TASK 1 = STACK ---");
        toys.push("Ball");
        toys.push("Blocks");
        toys.push("Puzzle");
        System.out.println("The toys are: " + toys);
        System.out.println("The number of toys are: " + toys.size());
        String firstToy = toys.pop();
        System.out.println("The first toy is " + firstToy + " and is being played");
        System.out.println("The remaining toys from the toy box are: " + toys);

        Queue<String> kids = new LinkedList<>();
        System.out.println("--- TASK 2 = QUEUE ---");
        kids.add("Maya");
        kids.add("Leo");
        kids.add("Nina");
        System.out.println("The kids are: " + kids);
        System.out.println("The number of kids are: " + kids.size());
        String firstKid = kids.poll();
        System.out.println("The first kid served is: " + firstKid);
        System.out.println("The kids who are still in the queue are: " + kids);
    }
}
