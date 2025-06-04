import java.util.*;
public class TreeSetTask {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        // Task 1: Store and display unique numbers
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(5);
        ts.add(6);
        System.out.println("The TreeSet is: "+ts);
        // Task 2: Add and Find Values.
        ts.add(7);
        ts.add(70);
        System.out.println(ts.getFirst());
        System.out.println(ts.getLast());
        System.out.println(ts.contains(7));

        // Task 3: Store student names alphabetically 
        // (it already gives or sorts the collection by default in alphabetical order)
        TreeSet<String> ts1 = new TreeSet<String>();
        ts1.add("SAK");
        ts1.add("PRAV");
        ts1.add("VAM");
        ts1.add("SUN");
        System.out.println("Original TreeSet is: "+ts1);
        // ts1.reversed();
        System.out.println("Reversed TreeSet is: "+ts1.reversed());

    }
}
