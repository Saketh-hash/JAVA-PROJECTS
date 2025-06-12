// package CRT DAY 13;
// Kadane's Algorithm (Maximum Subarray Sum)
// Description:
// Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
import java.util.*;
public class KadaneAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i < n; i++){
            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);
            if(currSum < 0){
                currSum = 0;
            }
        }
        System.out.println(maxSum);
        sc.close();
    }    
}
