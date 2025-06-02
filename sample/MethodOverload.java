// package CRT DAY 4;
class Calculator{
    int add(int x, int y){
        return x + y;
    }
    int add(int x, int y, int z){
        return x + y + z;
    }
}
public class MethodOverload {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(2, 3));
        System.out.println(cal.add(2, 3, 4));
    }
}
