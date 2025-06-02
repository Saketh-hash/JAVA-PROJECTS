// package CRT DAY 5;
// Hibernate is used to map java objects to relational database tables.
// Hibernate is a framework that provides a way to map Java objects to relational database tables.
import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine().toUpperCase();
        switch(day){
            case "MONDAY":
                System.out.println("Lets Learn Python");
                break;
            case "TUESDAY":
                System.out.println("Lets Learn Java");
                break;
            case "WEDNESDAY":
                System.out.println("Lets Learn C++");
                break;
            case "THURSDAY":
                System.out.println("Lets Learn C");
                break;
            case "FRIDAY":
                System.out.println("Lets Learn JavaScript");
                break;
            case "SATURDAY":
                System.out.println("Lets Learn PHP");
                break;
            case "SUNDAY":
                System.out.println("Lets Learn HTML");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
    }
}
