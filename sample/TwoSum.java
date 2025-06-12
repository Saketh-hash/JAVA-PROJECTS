// package CRT DAY 13;
// 1. TwoSum:
// Description: 
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// Constraints: You may assume that each input would have exactly one solution, and you may not use the same element twice.

import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] ans = new int[2];
        ans = twoSum(arr, target);
        System.out.println(ans[0] + " " + ans[1]);
        sc.close();
    }
    public static int[] twoSum(int[] arr, int target){
        int [] ans = new int[2];
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}
