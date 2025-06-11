// package CRT DAY 12;
import java.util.*;
public class BubbleSort2 {
    public static void main(String[] args) {
        String []arr = {"banana", "snake", "kite", "zoo"};
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j].compareTo(arr[j + 1]) > 0){
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
