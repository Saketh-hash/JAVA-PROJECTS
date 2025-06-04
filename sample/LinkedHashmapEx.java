import java.util.LinkedHashMap;

public class LinkedHashmapEx {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
        lhm.put("SAK", 90);
        lhm.put("PRAV", 80);
        lhm.put("VAM", 70);
        lhm.put("SUN", 60);
        System.out.println("The Linked HashMap is: " + lhm);
        System.out.println("The Size of the Linked HashMap is: " + lhm.size());
        System.out.println("The Linked HashMap is empty or not: " + lhm.isEmpty());
        System.out.println("The Linked HashMap contains the key SAK or not: " + lhm.containsKey("SAK"));
        System.out.println("The Linked HashMap contains the value 90 or not: " + lhm.containsValue(90));

        lhm.remove("SAK");
        System.out.println("The Linked HashMap after removing the key SAK is: " + lhm);
        lhm.remove("PRAV", 80);
        System.out.println("The Linked HashMap after removing the key PRAV and value 80 is: " + lhm);
        lhm.replace("VAM", 70, 75);
        System.out.println("The Linked HashMap after replacing the value 70 with 75 is: " + lhm);

    }
}
