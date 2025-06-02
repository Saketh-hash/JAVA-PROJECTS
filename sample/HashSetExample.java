// package CRT DAY 5;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> s = new HashSet<>();
        s.add("Apple");
        s.add("Banana");
        s.add("Orange");
        s.add("Grapes");
        s.add("Mango");
        s.add("Watermelon");
        s.add("Apple");
        System.out.println("HashSet: " + s);
        if(s.contains("Apple")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        ArrayList<String> al = new ArrayList<>(s);  // Converting HashSet to ArrayList
        System.out.println("ArrayList: " + al);
        

    }
}
