package sample;// package CRT DAY 3;
interface Printable{
    void print();
}
class Message implements Printable{ // Note: 
    public void print(){
        System.out.println("Hello World - Welcome to Interface solutions");
    }
}
public class implements_sol {
    public static void main(String[] args) {
        Message m = new Message();
        m.print();    // Hello World - Welcome to Interface solution
    }   
}
