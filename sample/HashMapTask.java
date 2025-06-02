import java.util.*;
public class HashMapTask {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");
        hm.put(103, "Gaurav");
        hm.put(104, "Praveen");
        hm.put(105, "Saketh");
        System.out.println("Hashmap is: " + hm);

        // Remove the value from the hashmap
        hm.remove(103);
        System.out.println("Hashmap after removing the value: " + hm);

        // Update the value from the hashmap
        hm.put(104, "Praveen Kumar");
        System.out.println("Hashmap after updating the value: " + hm);

        // Check if key or value exists in the hashmap
        System.out.println("Key 102 exists in the hashmap: " + hm.containsKey(102));
        System.out.println("Value Gaurav exists in the hashmap: " + hm.containsValue("Gaurav"));

        // Print all keys, values and key-value pairs
        System.out.println("Keys in the hashmap: " + hm.keySet()); // return type is Set
        System.out.println("Values in the hashmap: " + hm.values()); // return type is Collection
        System.out.println("Key-value pairs in the hashmap: " + hm.entrySet()); // return type is Set
    }
}
