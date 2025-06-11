// package CRT DAY 12;

import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        // Reverse an array
        // Ex : 1 2 3 4 5 -> 5 4 3 2 1
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(arr));
        int[] rev = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            rev[arr.length - i - 1] = arr[i];
        }
        System.out.println("Reversed Array: " + Arrays.toString(rev));
    }
}
