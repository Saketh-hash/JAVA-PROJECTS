package sample;
public class Constructor{
// Constructor has a same name as a class name and main purpose of the constructor is to initialise the object 
// Once the object is created the constructor is automatically called.

// Constructor is of two types: i.e., Parametrized Constructor and Non-parametrized Constructor
    Constructor(){  // Parametrised Constructor
        System.out.println("Hi");
    }
    Constructor(int x, int y){
        System.out.println("Hello");
    }
    Constructor(int x, int y, int z){
        System.out.println("Namaste");
    }
    public static void main(String[] args){
        Constructor obj = new Constructor();
        Constructor obj1 = new Constructor(5, 7);
        Constructor obj2 = new Constructor(1, 2, 3);        
    }
}