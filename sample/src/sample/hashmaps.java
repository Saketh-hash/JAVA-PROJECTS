package sample;
import java.util.*;

// Duplicate keys are not allowed in 
// Hashmaps are unordered key value pair, which depends on either key or on value. 
// It gives priority to the integer value
// Hash maps are like a locker with leaver you store data using a key.
public class hashmaps {
    public static void main(String[] args) {
        HashMap<Float, String> hmap = new HashMap<Float, String>();
        HashMap<String, Integer> hmap1 = new HashMap<String, Integer>();
        hmap.put(0.1F, "SREE");
        hmap.put(0.2F, "DHO");
        hmap.put(0.3F, "VAM");
        hmap.put(0.5F, "SAK");
        hmap.put(0.4F, "PRAV");    // Key Override
        System.out.println(hmap);

        hmap1.put("SAK", 939027193);
        hmap1.put("SAK1", 939207294);
        hmap1.put("SAK2", 939200974);
        hmap1.put("SAK3", 294724923);
        hmap1.put("SAK4", 923050934);

        System.out.println(hmap1);
    }
}
