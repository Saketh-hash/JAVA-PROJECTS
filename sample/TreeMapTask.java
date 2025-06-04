import java.util.*;
public class TreeMapTask {
    public static void main(String[] args) {
        // Task 1 - Store Student Marks
        TreeMap<String, Integer> studentMarks = new TreeMap<String, Integer>();
        studentMarks.put("SAK", 90);
        studentMarks.put("PRAV", 80);
        studentMarks.put("VAM", 70);
        studentMarks.put("SUN", 60);
        System.out.println(studentMarks);
        
        // Task 2 - Search in TreeMap
        System.out.println(studentMarks.containsKey("SAK"));
        System.out.println(studentMarks.containsValue(90));

        // Task 3 - Make Simple PhoneBook
        TreeMap<String, Integer> phoneBook = new TreeMap<String, Integer>();
        phoneBook.put("SAKETH", 939027193);
        phoneBook.put("PRAVEEN", 489285939);
        phoneBook.put("VAMSI", 35572070);
        phoneBook.put("SMRITHI MANDANNA", 939520293);
        System.out.println(phoneBook);
    }   
}
