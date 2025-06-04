// package CRT DAY 6;
// TreeMap is a part of java collection framework and it implements the map interface using a red black tree
// It stores key-value pairs and maintains the keys in sorted order

import java.util.*;
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> students = new TreeMap<Integer, String>();
        TreeMap<Integer, String> studen1 = (TreeMap<Integer, String>) students.clone();
        students.put(1, "SAK");
        students.put(2, "PRAV");
        students.put(3, "VAM");
        students.put(0, "SUN");

        System.out.println(students.size());
        System.out.println(students);
        // students.clone();
        System.out.println(studen1);
    }
}
