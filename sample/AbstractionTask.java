// package CRT DAY 8;

// Abstraction Task 1: Real-life example
// Imagine you are using a car just to drive it, not to build or repair it.
// List the features of a car that are necessary only for driving it.
// Do not include the internal parts like engine, wiring, fuel injection system, etc.
abstract class Car {
    // Imagine you are using a car just to drive it, not to build or repair it.
    abstract void drive();
    abstract void stop();
    abstract void turnLeft();
    abstract void turnRight();
    abstract void carfeatures();   // features of a car that are necessary only for driving it.
}

class AbstractionBody extends Car{
    @Override // Why do we need to override these methods?
    // Because these methods are abstract in the parent class.
    // We need to override these methods in the child class.
    void drive(){
        System.out.println("Car is driving");
    }
    void stop(){
        System.out.println("Car is stopping");
    }
    void turnLeft(){
        System.out.println("Car is turning left");
    }
    void turnRight(){
        System.out.println("Car is turning right");
    }
    void carfeatures(){
        System.out.println("Features of the Car are:");
        System.out.println("Car is having 4 wheels");
        System.out.println("Car is having 4 doors");
        System.out.println("Car is having 5 seats");
        System.out.println("Car is having GPS");
        System.out.println("Car is red in color.");
        System.out.println("Car is having 2 airbags");
        System.out.println();
    }

}
public class AbstractionTask {
    public static void main(String[] args) {
        AbstractionBody obj = new AbstractionBody();
        obj.drive();
        obj.carfeatures();
        obj.turnLeft();
        obj.turnRight();
        obj.stop();
    }
}
