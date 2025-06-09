// Use a Queue to sort numbers like [5, 2, 8]
// Create a list of games and play the most fun one first.
// Use a priority queue to pick smallest number from a list.
// Make a "to-do list" - do urgent things first.
// Find top 2 smallest numbers in a list using queue.
// Make a cartoon style "task queue" - Eat 🍕 > Sleep 😴 > Code 🧑🏻‍💻
import java.util.*;
public class SortQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(2);
        queue.add(8);
        // Use a queue to sort numbers like [5, 2, 8]

        System.out.println("The Sorted Queue: ");
        while(!queue.isEmpty()){
            System.out.print(queue.poll() + " ");
        }
        System.out.println();
        // Create a list of games and play the most fun one first using custom comparator
        class Game implements Comparable<Game> {
            String name;
            int funLevel; // Higher number = more fun

            Game(String name, int funLevel) {
                this.name = name;
                this.funLevel = funLevel;
            }

            public int compareTo(Game other) {
                return other.funLevel - this.funLevel; // max-heap
            }

            public String toString() {
                return name + " (Fun Level: " + funLevel + ")";
            }
        }
        PriorityQueue<Game> gameQueue = new PriorityQueue<>();
        gameQueue.add(new Game("Chess", 5));
        gameQueue.add(new Game("Cricket", 8));
        gameQueue.add(new Game("Football", 7));

        System.out.println("\nThe Most Fun Game: " + gameQueue.poll());
        // Use a priority queue to pick smallest number from a list.
        queue.add(5);
        queue.add(2);
        queue.add(8);
        System.out.println("Queue is: " + queue);
        System.out.println("The Smallest Number is: " + queue.poll());

        // Make a "to-do list" - do urgent things first.
        Queue<String> todoList = new LinkedList<>();
        todoList.add("Finish homework 📚");
        todoList.add("Buy groceries 🛒");
        todoList.add("Workout 💪");
        todoList.add("Call mom 📞");
        System.out.println();
        System.out.println("📝 To-Do List (FIFO Order):");
        while (!todoList.isEmpty()) {
            System.out.println("Task: " + todoList.poll());
        }
        System.out.println();
        // Find top 2 smallest numbers in a list using queue.
        Queue<Integer> list = new PriorityQueue<>();
        list.add(5);
        list.add(2);
        list.add(8);
        System.out.println("The Top 2 Smallest Numbers are: ");
        for(int i = 0; i < 2; i++){
            System.out.print(list.poll() + " ");
        }
        System.out.println();
        // Make a cartoon style "task queue" - Eat 🍕 > Sleep 😴 > Code 🧑🏻‍💻   
        Queue<String> taskQueue = new LinkedList<>();
        taskQueue.add("Eat 🍕");
        taskQueue.add("Sleep 😴");
        taskQueue.add("Code 🧑🏻‍💻");
        System.out.println("\nThe Task Queue: ");
        while(!taskQueue.isEmpty()){
            System.out.println(taskQueue.poll());
        }

    }
}
