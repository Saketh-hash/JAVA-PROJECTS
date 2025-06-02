// package CRT DAY 5;
import java.util.*;
public class P3Hashset {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(6);
        System.out.println("Before Deletion, The Size is: " + s.size());
        System.out.println("List using ArrayList: " + s);

        s.remove(4);
        System.out.println("After Deletion, The Size is: " + s.size());
        System.out.println("List using ArrayList: " + s);
        if(s.contains(sc.nextInt())){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
