import java.util.*;
public class FindMaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        arr[0] = -1;
        int largest = 0;
        for(int i = 0; i < n; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        System.out.println("The Largest number in the array is: " + largest);
    }
}
