// package CRT DAY 8;
import java.util.*;
// Task 6 - Country and Capital
// Objective: Use a TreeMap to store country-capital map i.e., store country names as key and their capitals as values.
// Practice with methods like firstKey(), lastKey(), higherKey(), and lowerKey().
// Instructions:
// Create a TreeMap<String, String> named countryCapitalMap.
// Add the following country-capital pairs to the map:
// "India" -> "New Delhi"
// "USA" -> "Washington"
// "Germany" -> "Berlin"
// "Japan" -> "Tokyo"
// "India" -> "Delhi" (observe what happens)
public class CountryCapital {
    public static void main(String[] args) {
        TreeMap<String, String> countryCapitalMap = new TreeMap<>();
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("USA", "Washington");
        countryCapitalMap.put("Germany", "Berlin");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("India", "Delhi");

        
        System.out.println("The country-capital map is: " + countryCapitalMap);
        System.out.println("The first key is: " + countryCapitalMap.firstKey());
        System.out.println("The last key is: " + countryCapitalMap.lastKey());
        System.out.println("The key higher than USA is: " + countryCapitalMap.higherKey("USA"));
        System.out.println("The key lower than USA is: " + countryCapitalMap.lowerKey("USA"));

        // Display all entries in sorted order by country name.
        System.out.println("The entries in sorted order by country name are: ");
        for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        // As we observed, the key "India" is repeated, so the value "Delhi" replaces the previous value "New Delhi".
    }
}
