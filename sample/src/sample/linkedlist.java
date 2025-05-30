package sample;
import java.util.*;
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<String>();
        li.add("Apple");
        li.add("Banana");
        li.add("Mango");
        li.add("Orange");
        li.add("Grapes");
        li.add(1, "Dragon Fruit");
        li.addFirst("Kiwi");
        li.addLast("Pineapple");
        li.removeFirst();
        li.removeLast();
        li.remove(2);
        li.set(2, "Watermelon");
        System.out.println("The linked list is :"  + li);

    }
}
