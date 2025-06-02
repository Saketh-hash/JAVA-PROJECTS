class Car implements Runnable{
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
public class Threads_Runnable {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(b);
        t2.start();
        t1.start();
    }
}
