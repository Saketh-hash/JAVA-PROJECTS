import java.util.*;

public class HeapExample {
    // Heap is a special tree structure where the numbers are arranged like kids standing in a line. 
    // Everyone follows a rule either a smallest number is always on top like MinHeap or the biggest number is always on top like MaxHeap.
    public static void main(String[] args) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        minheap.add(20);
        minheap.add(5);
        minheap.add(15);
        minheap.add(10);

        System.out.println("Min Heap output : ");
        while (!minheap.isEmpty()) {
            System.out.print(minheap.poll() + " ");
        }

        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        maxheap.add(20);
        maxheap.add(5);
        maxheap.add(15);
        maxheap.add(10);

        System.out.println("\nMax Heap output : ");
        while (!maxheap.isEmpty()) {
            System.out.print(maxheap.poll() + " ");
        }
    }

    
}