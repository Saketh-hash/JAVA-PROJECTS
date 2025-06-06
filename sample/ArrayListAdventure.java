// package Java Programs.CRT DAY 9;

import java.util.*;
public class ArrayListAdventure {
    public static void main(String[] args) {
        ArrayList<String> cartoon = new ArrayList<>();

        cartoon.add("Spiderman");
        cartoon.add("Ironman");
        cartoon.add("Thor");
        cartoon.add("Captain America");
        cartoon.add("Loki");
        cartoon.add("Black Panther");
        cartoon.add("Moon Knight");

        System.out.println("The Cartoon Characters are: " + cartoon);
        System.out.println("The size of the ArrayList is: " + cartoon.size());

        cartoon.remove("Black Panther");
        System.out.println("After removal, The Cartoon characters are: " + cartoon);
        System.out.println("The Size of the Array list is: " + cartoon.size());
        cartoon.set(4, "Black widow");
        System.out.println("After replacing Loki with Black Widow, The Cartoon characters are: " + cartoon);
        System.out.println();
        System.out.println("The Cartoon Characters are: ");
        for(String i : cartoon){
            System.out.println(i);
        }
        Collections.sort(cartoon);
        System.out.println("Sorted Cartoon Characters: " + cartoon);
        
        
    }
}
