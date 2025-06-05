// package CRT DAY 8;

// Inheritance Task 1: Animal Kingdom
// You are designing a program about animals. Create a class structure where:
// Animal is the base class
// Dog and Cat are subclasses
// Task - List 3 common properties or methods in the Animal Class (e.g., eat, sleep) and 2 unique 
// features for each Dog and Cat class.
class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
    void sleep(){
        System.out.println("Animal is sleeping");
    }
    void sound(){
        System.out.println("Animal is making sound");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
    void color(){
        System.out.println("Dog is black in color");
    }
}
class Cat extends Animal{
    void meows(){
        System.out.println("Cat is Meowing");
    }
    void furr(){
        System.out.println("Cat has more furr");
    }
}

public class InheritanceTask {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.bark();
        dog.color();
        dog.eat();
        dog.sleep();
        dog.sound();
        cat.meows();
        cat.furr();
        cat.eat();
        cat.sleep();
        cat.sound();
    }
}
