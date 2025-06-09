import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers to perform the operation: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println();
        
        
        // System.out.println();
        while (true) {
            System.out.println("|--------Simple Calculator-------|");
            System.out.println("|           1. Addition          |");
            System.out.println("|           2. Subtraction       |");
            System.out.println("|           3. Multiplication    |");
            System.out.println("|           4. Division          |");
            System.out.println("|           5. Modulus           |");
            System.out.println("|           6. Exit              |");
            System.out.println("|--------Simple Calculator-------|");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int result = a + b;
                    System.out.println("Addition of " + a + "and" + b + " is: " + result);
                    break;
                case 2:
                    int result1 = a - b;
                    System.out.println("Subtraction of " + a + "and" + b + " is: " + result1);
                    break;
                case 3:
                    int result2 = a * b;
                    System.out.println("Multiplication of " + a + "and" + b + " is: " + result2);
                    break;
                case 4:
                    double result3 = a / b;
                    System.out.println("Division of " + a + "and" + b + " is: " + result3);
                    break;
                case 5:
                    int result4 = a % b;
                    System.out.println("Modulus of " + a + "and" + b + " is: " + result4);
                    break;                        
                case 6:
                    System.out.println("Exiting....Good Bye!");
                    System.exit(0);
                    break;
                default:
                System.out.println("Invalid Choice");
                    break;
            }
            sc.close();
        }
        

    }
}
