package sample;
// package CRT DAY 3;

import java.io.FileReader;
import java.io.IOException;

public class files {
    public static void main(String[] args) {
        try{
            // Change the path below to your actual username
            FileReader reader = new FileReader("hello.txt");
            int ch;
            while((ch = reader.read()) != -1){
                System.out.print((char)ch);
            }
            reader.close();
        }
        catch(IOException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
