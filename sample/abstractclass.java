package sample;
// package CRT DAY 3;
abstract class Machine{
    abstract void ATM();
}
class Bank extends Machine{
    void ATM(){
        System.out.println("ATM USING JAVA WITH PHP");
    }
}

public class abstractclass {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.ATM();
    }
}
