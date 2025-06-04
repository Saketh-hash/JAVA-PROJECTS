import java.util.*;
public class EvenOdd {
    
    public static void main(String[] args) {
        // With using If-else
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("--- With using if-else ---");
        if(n%2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        // Without using if-else
        System.out.println("--- Without using if-else ---");
        String []arr = {"Even", "Odd"};
        System.out.println(arr[n%2]);
        sc.close();

    }   
}
