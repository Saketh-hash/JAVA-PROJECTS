// package Java Programs.CRT DAY 9;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 12, 1, 6 };
        System.out.println("Original array: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // System.out.println(arr);
    }
    
}
