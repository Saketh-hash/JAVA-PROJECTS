// package Java Programs.CRT DAY 7;
// Task 1 - You are stacking plates in Kitchen. Everytime a plate is cleaned, it is pushed into stack.
// When someone eats, they take the top plate. 
// HINT: Push 5 plate numbers, show how many plates are left.

import java.util.Stack;

public class StackTask1 {
    public static void main(String[] args) {
        Stack<Integer> plates = new Stack<Integer>();
        System.out.println("The plates are cleaned: ");
        
        plates.push(100);
        plates.push(101);
        plates.push(102);
        plates.push(103);
        plates.push(104);

        System.out.println("The Cleaned Plates are: " + plates);
        System.out.println("The Total number of plates after cleaning and before eating: " + plates.size());
        System.out.println("Person 1 wants to eat, so he takes the top plate: " + plates.pop());
        System.out.println("Person 2 wants to eat, so he takes the next top plate: " + plates.pop());
        
        System.out.println("The Total number of plates after eating: " + plates.size());
        System.out.println("The plates after eating: " + plates);
    }
}
