// Threading can be done in two ways:
// 1. Extending the Thread class
// 2. Implementing the Runnable interface

class Car extends Thread{   // Thread is a predefined class in java.lang package
    public void run(){
        for(int i = 0; i <= 3; i++){
            System.out.println("Car is running");
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}

class Bike implements Runnable{
    public void run(){
        for(int i = 0; i <= 3; i++){
            System.out.println("Bike is running");
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        Car obj = new Car();    // obj1 is used to start the thread (extends Thread)
        obj.start();
        Bike obj1 = new Bike(); 
        Thread t1 = new Thread(obj1);   // t1 is used to start the thread (implements Runnable)
        t1.start();
    }
}
