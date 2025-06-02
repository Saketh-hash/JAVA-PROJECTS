// package CRT DAY 5;

import java.util.Scanner;

public class RainUmbrella {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String isRaining = sc.nextLine().toUpperCase();
        if(isRaining.equals("YES")){
            System.out.println("Take an umbrella");
        }
        else{
            System.out.println("You don't need an umbrella");
        }
    }
}
