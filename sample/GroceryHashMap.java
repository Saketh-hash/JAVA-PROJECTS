// package Java Programs.CRT DAY 9;
import java.util.*;
public class GroceryHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> grocery = new HashMap<>();
        grocery.put("Milk", 10);
        grocery.put("Bread", 5);
        grocery.put("Eggs", 12);
        grocery.put("Butter", 20);
        grocery.put("Cheese", 15);
        System.out.println("The Grocery Items are: " + grocery);
        System.out.println("The size of the HashMap is: " + grocery.size());
        int total_cost = 0;
        for(Map.Entry<String, Integer> entry : grocery.entrySet()){
            total_cost += entry.getValue();
        }
        System.out.println("The total cost of the items is: " + total_cost);
        grocery.put("Cheese", 40);
        System.out.println("After updating the price of Cheese, The Grocery Items are: ");
        System.out.println("The size of the HashMap is: " + grocery.size());
        for(Map.Entry<String, Integer> entry : grocery.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        grocery.remove("Bread");
        System.out.println("After removal, The Grocery Items are: " + grocery);
        System.out.println("The size of the HashMap is: " + grocery.size());
    }
}
