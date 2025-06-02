// package CRT DAY 4;

class Parent{
    void display(){
        System.out.println("Hello Child.");
    }
}
class Child extends Parent{
    @Override
    void display(){
        System.out.println("Hi Parent");
    }
}
class Child1 extends Parent{
    void display(){
        System.out.println("Hello Namaste");
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        Child obj = new Child();
        Child1 obj1 = new Child1();
        // obj.display();
        obj1.display();
    }    
}
