// package CRT DAY 12;
// Sort Strings in alphabetical order
import java.util.*;
public class SortStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
