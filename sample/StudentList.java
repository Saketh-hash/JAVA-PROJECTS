import java.util.*;
public class StudentList {
    public static void main(String[] args) {
        HashSet<String> li = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the list of students: ");
        for(int i = 1; i <= 5; i++){
            System.out.println("Enter the Student: " + i);
            li.add(sc.nextLine());
        }
        // System.out.println(li);
        // for(String str: li){    // For-each loop - faster than normal for loop
        //     System.out.println(str);
        // }
        System.out.println(li);
    }
}