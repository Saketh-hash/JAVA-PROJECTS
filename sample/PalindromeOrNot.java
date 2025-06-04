import java.util.*;
public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Using Integer
        // Palindrome is a number which is same as its reverse
        int rev = 0;
        int temp = n;
        while(n > 0){
            int rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        if(temp == rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        // Using String
        System.out.println("Enter a string: ");
        sc.nextLine();
        String str = sc.next();
        String revStr = "";
        for(int i = str.length()-1; i >= 0; i--){
            revStr = revStr + str.charAt(i);
        }
        if(str.equals(revStr)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
}
