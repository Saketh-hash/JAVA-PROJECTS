import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 12, 1, 6 };
        System.out.println("Original Array: " + Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n < 2){
            return;
        }
        int mid = n / 2;
        int [] left = new int[mid];
        int [] right = new int[n - mid];
        for(int i = 0; i < mid; i++){
            left[i] = arr[i];
        }
        for(int i = mid; i < n; i++){
            right[i - mid] = arr[i];

        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, arr);
    }
    public static void merge(int[] left, int[] right, int[] arr){
        int nL = left.length;
        int nR = right.length;
        int i = 0, j = 0, k = 0;
        while(i < nL && j < nR){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
                k++;
            }
            else{
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        while(i < nL){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < nR){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
