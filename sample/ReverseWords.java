// package CRT DAY 12;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "Hello World";
        // Reverse words
        // Ex : Hello World -> World Hello
        String[] arr = str.split(" ");
        String rev = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            rev += arr[i] + " ";
        }
        System.out.println("Reversed Words: "+ rev);
        
    }

}
