// Find Square root of a number using Binary Search
// Objective: Implement a function to find the square root of a given number using binary search.
import java.util.*;
public class SquareRoot {
    public static int squareRoot(int x){
        int start = 1, end = x, ans = 0;
        if(x == 0 || x == 1){
            return x;
        }
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid <= x / mid){
                start = mid + 1;
                ans = mid;
            }else{
                end = mid - 1;
            }    
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        int result = squareRoot(x);
        System.out.println("Square root of " + x + " is: " + result);

        sc.close();
    }
}
