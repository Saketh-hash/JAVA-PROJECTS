// Palindrome Checker (Stack or StringBuilder)
// Task : Ask the user for a word
// Check if the word is a palindrome (reads the same forwards and backwards)
// Print the result
// Example:
// Input: radar
// Output: radar is a palindrome.
// Input: hello
// Output: hello is not a palindrome.
import java.util.*;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Using StringBuilder
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        String reverse = sb.toString();
        if(word.equals(reverse)){
            System.out.println(word + " is a palindrome.");
        }else{
            System.out.println(word + " is not a palindrome.");
        }
        // sc.close();
        System.out.println("...Press Enter to use Stack approach...");
        // Using Stack
        
        sc.nextLine();
        System.out.println("Palindrome Checker Using Stack Approach.");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word1 = sc1.nextLine();
        Stack<Character> stack = new Stack<>(); 
        for(int i = 0; i < word1.length(); i++){
            stack.push(word1.charAt(i));
        }
        StringBuilder sb1 = new StringBuilder();
        while(!stack.isEmpty()){
            sb1.append(stack.pop());
        }
        String reverse1 = sb1.toString();
        if(word1.equals(reverse1)){
            System.out.println(word1 + " is a palindrome.");
        }else{
            System.out.println(word1 + " is not a palindrome.");
        }
    }
}
