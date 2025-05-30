package sample;
// // package CRT DAY 2.CRT DAY 3;
// import java.util.*;
// public class linkedlist2 {
//     public static void main(String[] args) {
//         HashSet<String> li = new HashSet<String>();
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the list of students: ");
//         for(int i = 1; i <= 5; i++){
//             System.out.println("Enter the Student: " + i);
//             li.add(sc.nextLine());
//         }
//         // System.out.println(li);
//         // for(String str: li){    // For-each loop - faster than normal for loop
//         //     System.out.println(str);
//         // }
//         System.out.println(li);
//     }
// }
import java.util.*;

public class linkedlist2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 3; i++){
            hmap.put(sc.nextInt(), sc.next());
        } 
        System.out.println(hmap);
    }
}