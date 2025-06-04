// package CRT DAY 6;
// Tree Set is a part of java collection framework and it represents a set collection that uses a red-black-tree. 
// It is a type of Binary Search Tree

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("TreeSet: " + numbers);
        // Add an element to the TreeSet
        System.out.println("First Element: " + numbers.first());
        System.out.println("Last Element: " + numbers.last());
        System.out.println("The Next Element of 30 is" + numbers.higher(30));  // It displays the next element in the TreeSet
   
    }
}
