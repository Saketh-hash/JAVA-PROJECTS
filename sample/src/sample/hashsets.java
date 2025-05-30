package sample;
import java.util.*;
// Hashset is unordered and will not allow duplicate values.
// Hastset lets you store a group of unique items and its like a basket where duplicate values are not allowed.
// It is a collection of items where every item is unique.
// It is like a locker where you can store your items and you can not store duplicate items.
// It is like a basket where you can store your items and you can not store duplicate items.
public class hashsets {
    public static void main(String[] args) {
        HashSet<String> cricketers = new HashSet<String>();
        cricketers.add("Dhoni");
        cricketers.add("Rohit");
        cricketers.add("Ganguly");
        cricketers.add("Sachin");
        cricketers.add("Virat");
        System.out.println(cricketers);

        cricketers.add("Dhoni");    // Duplicate values are not allowed in hashset
        System.out.println(cricketers);
    }
}
