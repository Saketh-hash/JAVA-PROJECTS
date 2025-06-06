import java.util.*;
public class SortingHat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Sorting Numbers
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array is: " + Arrays.toString(arr));

        // Sorting Characters
        String []str = {"sak", "prav", "vam", "sur"};
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n - i; j++){
                if(str[j].compareTo(str[j - 1]) < 0){
                    String temp = str[j];
                    str[j] = str[j - 1];
                    str[j - 1] = temp;
                }
            }
        }
        System.out.println("Sorted String Array is: " + Arrays.toString(str));

    }
}
