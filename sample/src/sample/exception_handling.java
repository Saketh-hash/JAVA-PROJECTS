package sample;
// import java.util.*;
public class exception_handling {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            System.out.println("Result is: " + a / b);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot Divide by Zero");
        }
        finally{
            System.out.println("Exit");
        }
    }
}
