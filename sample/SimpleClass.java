// import java.util.*;

class ArrayListPractice{
    public ArrayListPractice(){
        System.out.println("ArrayList of Students");
    }
}
class LinkedListPractice extends ArrayListPractice{
    public LinkedListPractice(){
        System.out.println("LinkedList of Students");
    }
}

class HashSetPractice extends LinkedListPractice{
    public HashSetPractice(){
        System.out.println("HashSet of Students");
    }
}

class HashMapPractice extends HashSetPractice{
    public HashMapPractice(){
        System.out.println("HashMap of Students");
    }
}


public class SimpleClass {
    public static void main(String[] args) {
        // LinkedList obj = new LinkedList();
        HashMapPractice obj1 = new HashMapPractice();
    }
}
