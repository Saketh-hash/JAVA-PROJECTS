import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        int first = 0, second = 1;
        System.out.println("The Fibonacci Series is: ");
        for(int i = 0; i < n; i++){
            System.out.print(first + " ");
            int third = first + second;
            first = second;
            second = third;
        }
        
    }
}
