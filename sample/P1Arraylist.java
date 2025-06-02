// package CRT DAY 5;

import java.util.*;

public class P1Arraylist {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        System.out.println("Before Deletion, The Size is: " + l.size());
        System.out.println("List using ArrayList: " + l);

        l.remove(4);
        l.removeFirst();
        l.removeLast();
        System.out.println("After Deletion, The Size is: " + l.size());
        System.out.println("List using ArrayList: " + l);
        
    } 
}
