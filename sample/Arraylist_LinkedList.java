// package CRT DAY 5;
import java.util.*;

public class Arraylist_LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();
        // ArrayList
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            al.add(sc.next());
        }
        // Remove an element by Index and by value
        System.out.println("Array List is: " + al);
        System.out.println("Reverse ArrayList is: " + al.reversed());
        // al.add(null);
        // Natural order will not be maintained for a null value, so NullPointerException will occur if we try to sort the list
        Collections.sort(al);
        System.out.println("Sorted ArrayList: " + al);
        
        al.remove(2);
        al.remove("SAK");
        


    }
}
